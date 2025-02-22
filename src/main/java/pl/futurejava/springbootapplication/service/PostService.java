package pl.futurejava.springbootapplication.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.futurejava.springbootapplication.model.Comment;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.repository.CommentRepository;
import pl.futurejava.springbootapplication.repository.PostRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {

    private static final int PAGE_SIZE = 20;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public List<Post> getPosts(int page, Sort.Direction sort) {
        return postRepository.findAllPosts(PageRequest.of(page,PAGE_SIZE, Sort.by(sort, "id")));
    }


    public Post getSinglePost(long id) {
        return postRepository.findById(id)
                .orElseThrow();
    }

    public List<Post> getPostsByTitle(String title) {
        return postRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Post> getPostsWithComments(int page, Sort.Direction sort) {
        List<Post> allPosts = postRepository.findAllPosts(PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
        List<Long> ids = allPosts.stream()
                .map(Post::getId)
                .toList();
        List<Comment> comments = commentRepository.findAllByPostIdIn(ids);
        allPosts.forEach(post -> post.setComment(extractComments(comments, post.getId())));
        return allPosts;
    }

    private List<Comment> extractComments(List<Comment> comments, long id) {
        return comments.stream()
                .filter(comment -> comment.getPostId() == id)
                .toList();
    }

    public Post addPost(Post post) {

        post.setTitle(post.getTitle());
        post.setContent(post.getContent());
        post.setCreated(post.getCreated());
        Post saved = postRepository.save(post);
        return saved;
    }

    @Transactional
    public Post editPost(Post post) {
        Post postEdited = postRepository.findById(post.getId()).orElseThrow();
        postEdited.setTitle(post.getTitle());
        postEdited.setContent(post.getContent());
        return postEdited;
    }


    public void deletePost(long id) {
        postRepository.deleteById(id);
    }
}
