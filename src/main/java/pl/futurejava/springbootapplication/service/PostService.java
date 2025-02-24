package pl.futurejava.springbootapplication.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.futurejava.springbootapplication.controller.PostDtoMapper;
import pl.futurejava.springbootapplication.controller.dto.PostDTO;
import pl.futurejava.springbootapplication.model.Comment;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.repository.CommentRepository;
import pl.futurejava.springbootapplication.repository.PostRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {

    private static final int PAGE_SIZE = 20;

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public ResponseEntity<List<PostDTO>> getAllPosts(Integer page, Sort.Direction sort) {
        int pageNumber = page != null && page > 0 ? page : 1;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        List<Post> allPosts = postRepository.findAllPosts(PageRequest.of(pageNumber - 1, PAGE_SIZE, Sort.by(sortDirection, "id")));
        List<PostDTO> postDTOList = PostDtoMapper.mapToPostDtos(allPosts);
        return ResponseEntity.status(HttpStatus.OK).body(postDTOList);
    }

    public ResponseEntity<List<Post>> getPostsWithComments(Integer page, Sort.Direction sort) {

        int pageNumber = page != null && page > 0 ? page : 1;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        List<Post> allPosts = postRepository.findAllPosts(PageRequest.of(pageNumber - 1, PAGE_SIZE, Sort.by(sortDirection, "id")));
        List<Long> ids = allPosts.stream()
                .map(Post::getId)
                .toList();
        List<Comment> comments = commentRepository.findAllByPostIdIn(ids);

        allPosts.forEach(post -> {
            post.setComment(extractComments(comments, post.getId()));
        });

        return ResponseEntity.status(HttpStatus.OK).body(allPosts);
    }

    public ResponseEntity<Post> getSinglePostWithComments(Long id) {
        return postRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<List<Post>> getPostsByTitle(String title) {
        List<Post> posts = postRepository.findByTitleContainingIgnoreCase(title);

        if (posts.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(posts);
    }

    public ResponseEntity<Post> addPost(Post post) {

        post.setTitle(post.getTitle());
        post.setContent(post.getContent());
        Post savedPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(post.getId())
                .toUri();

        return ResponseEntity.created(location).body(savedPost);
    }

    public ResponseEntity<Comment> addComment(Long id, Comment comment) {
        Optional<Post> postById = postRepository.findById(id);
        if (postById.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        comment.setPostId(id);
        commentRepository.save(comment);
        postById.get().getComment().add(comment);

        postRepository.save(postById.get());

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{commentId}")
                .buildAndExpand(comment.getId())
                .toUri();

        return ResponseEntity.created(location).body(comment);
    }

    @Transactional
    public ResponseEntity<Post> editPost(Post post) {
        Post postEdited = postRepository.findById(post.getId()).orElseThrow();
        postEdited.setTitle(post.getTitle());
        postEdited.setContent(post.getContent());


        return ResponseEntity.status(HttpStatus.OK).body(updatedPost);
    }

    public ResponseEntity<Void> deletePost(Long id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    private List<Comment> extractComments(List<Comment> comments, Long id) {
        return comments.stream()
                .filter(comment -> comment.getPostId().equals(id))
                .toList();
    }

    public ResponseEntity<Post> partiallyEditPost(Long id, Post post) {
    }
}
