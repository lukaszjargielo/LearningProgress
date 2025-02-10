package pl.futurejava.Spring_web_jpa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.futurejava.Spring_web_jpa.entity.Post;
import pl.futurejava.Spring_web_jpa.service.PostService;

@RestController
@RequestMapping("posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Post>> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Integer id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Post> updateBodyPost(@PathVariable Integer id, @RequestBody Post post) {
        return postService.updateBodyPost(id, post);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Integer id) {
        return postService.deletePost(id);
    }
}
