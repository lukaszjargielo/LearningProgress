package pl.futurejava.Spring_web_jpa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("posts")
    public ResponseEntity< Iterable<Post>> getPosts() {
        Iterable<Post> posts = postRepository.findAll();

        return ResponseEntity.ok(posts);
    }

}
