package pl.futurejava.Spring_web_jpa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("posts")
    public ResponseEntity<Iterable<Post>> getAllPosts() {
        Iterable<Post> posts = postRepository.findAll();

        return ResponseEntity.ok(posts);
    }

    @GetMapping("posts/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Integer id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            return ResponseEntity.ok(post.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("posts")
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        Post savedPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedPost.getId())
                .toUri();

        return ResponseEntity.created(location).body(savedPost);
    }

    @PatchMapping("posts/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Integer id, @RequestBody Post post) {
        return postRepository.findById(id)
                .map(existingPost -> {
                    existingPost.setBody(post.getBody());

                    return postRepository.save(existingPost);
                })
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
