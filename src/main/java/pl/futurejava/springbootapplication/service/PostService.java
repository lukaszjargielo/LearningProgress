package pl.futurejava.springbootapplication.service;

import org.springframework.stereotype.Service;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.repository.PostRepository;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }
}
