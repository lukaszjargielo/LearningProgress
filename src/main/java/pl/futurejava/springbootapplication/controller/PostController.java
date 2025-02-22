package pl.futurejava.springbootapplication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import pl.futurejava.springbootapplication.controller.dto.PostDto;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.service.PostService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public List<PostDto> getPosts(@RequestParam(required = false) Integer page, @RequestParam(required = false)Sort.Direction sort) {
        int pageNumber = page != null && page > 0 ? page : 1;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        return PostDtoMapper.mapToPostDtos(postService.getPosts(pageNumber - 1, sortDirection));
    }

    @GetMapping("/posts/comments")
    public List<Post> getPostsWithComments(@RequestParam(required = false) Integer page, @RequestParam(required = false)Sort.Direction sort) {
        int pageNumber = page != null && page > 0 ? page : 1;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        return postService.getPostsWithComments(pageNumber - 1, sortDirection);
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id) {
        return postService.getSinglePost(id);
    }

    @GetMapping("/posts/search")
    public List<Post> getPostsByTitle(@RequestParam String title) {
        return postService.getPostsByTitle(title);
    }

    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }

    @PutMapping("/posts")
    public Post editPost(@RequestBody Post post) {
        return postService.editPost(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable long id) {
        postService.deletePost(id);

    }
}
