package pl.futurejava.springbootapplication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.futurejava.springbootapplication.controller.dto.PostDto;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.service.PostService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public List<PostDto> getPosts(@RequestParam(required = false) int page) {
        int pageNumber = page > 0 ? page : 1;
        return PostDtoMapper.mapToPostDtos(postService.getPosts(pageNumber - 1));
    }

    @GetMapping("/posts/comments")
    public List<Post> getPostsWithComments(@RequestParam(required = false) int page) {
        int pageNumber = page > 0 ? page : 1;
        return postService.getPostsWithComments(pageNumber - 1);
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id) {
        return postService.getSinglePost(id);
    }

    @GetMapping("/posts/search")
    public List<Post> getPostsByTitle(@RequestParam String title) {
        return postService.getPostsByTitle(title);
    }
}
