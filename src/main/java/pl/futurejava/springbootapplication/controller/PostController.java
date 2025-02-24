package pl.futurejava.springbootapplication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.futurejava.springbootapplication.controller.dto.PostDTO;
import pl.futurejava.springbootapplication.model.Comment;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.service.PostService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    //DZIAŁA
    @GetMapping
    public ResponseEntity<List<PostDTO>> getAllPosts(@RequestParam(required = false) Integer page, @RequestParam(required = false) Sort.Direction sort) {

        return postService.getAllPosts(page, sort);
    }

    //DZIAŁA
    @GetMapping("/comments")
    public ResponseEntity<List<Post>> getPostsWithComments(@RequestParam(required = false) Integer page, @RequestParam(required = false) Sort.Direction sort) {

        return postService.getPostsWithComments(page, sort);
    }

    //DZIAŁA
    @GetMapping("/{id}")
    public ResponseEntity<Post> getSinglePostWithComments(@PathVariable Long id) {

        return postService.getSinglePostWithComments(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Post>> getPostsByTitle(@RequestParam String title) {

        return postService.getPostsByTitle(title);
    }

    //DZIAŁA
    @PostMapping
    public ResponseEntity<Post> addPost(@RequestBody Post post) {

        return postService.addPost(post);
    }

    @PostMapping("{id}/comments")
    public ResponseEntity<Comment> addComment(@PathVariable Long id, @RequestBody Comment comment) {

        return postService.addComment(id, comment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> editPost(@PathVariable Long id, @RequestBody Post post) {

        postService.editPost(post);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Post> partiallyEditPost(@PathVariable Long id, @RequestBody Post post) {
        return postService.partiallyEditPost(id, post);
    }

    @PutMapping("/{id}/comments/{commentId}")
    public ResponseEntity<Comment> editComment(@PathVariable Long commentId, @RequestBody Comment comment) {
        return commentService.editComment
    }

    //DZIAŁA
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {

        return postService.deletePost(id);

    }
}
