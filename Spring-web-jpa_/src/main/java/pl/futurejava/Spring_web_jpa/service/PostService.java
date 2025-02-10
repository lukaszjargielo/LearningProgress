package pl.futurejava.Spring_web_jpa.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.futurejava.Spring_web_jpa.DTO.PostDTO;
import pl.futurejava.Spring_web_jpa.DTO.UserDTO;
import pl.futurejava.Spring_web_jpa.entity.Post;
import pl.futurejava.Spring_web_jpa.repository.PostRepository;

import java.net.URI;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public ResponseEntity<Iterable<PostDTO>> getAllPosts() {
        Iterable<Post> posts = postRepository.findAll();
        Iterable<PostDTO> postDTOs = StreamSupport.stream(posts.spliterator(), false)
                .map(post -> new PostDTO(post.getId(), post.getBody(),
                        new UserDTO(post.getUser().getId(), post.getUser().getDisplayName())))
                .toList();
        return ResponseEntity.ok(postDTOs);
    }

    public ResponseEntity<PostDTO> getPostById(Integer id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();

            PostDTO postDTO = new PostDTO(post.getId(), post.getBody(),
                    new UserDTO(post.getUser().getId(), post.getUser().getDisplayName()));
            return ResponseEntity.ok(postDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Post> addPost(Post post) {
        Post savedPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedPost.getId())
                .toUri();

        return ResponseEntity.created(location).body(savedPost);
    }

    public ResponseEntity<Post> updateBodyPost(Integer id, Post post) {
        return postRepository.findById(id)
                .map(existingPost -> {
                    existingPost.setBody(post.getBody());

                    return postRepository.save(existingPost);
                })
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Void> deletePost(Integer id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
