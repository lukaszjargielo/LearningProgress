package pl.futurejava.springbootapplication.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.service.PostService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

  /*  public PostController(PostService postService) {
        this.postService = postService;
    }*/

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    /*@GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id) {
        return postService.getSinglePost(id);
    }*/
}
