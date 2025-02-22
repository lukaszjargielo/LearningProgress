package pl.futurejava.springbootapplication.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.futurejava.springbootapplication.model.Post;
import pl.futurejava.springbootapplication.repository.PostRepository;
import java.util.List;
@RequiredArgsConstructor
@Service
public class PostService {

    private static final int PAGE_SIZE = 20;
    private final PostRepository postRepository;

    public List<Post> getPosts(int page) {
        return postRepository.findAllPosts(PageRequest.of(page,PAGE_SIZE));
    }


    public Post getSinglePost(long id) {
        return postRepository.findById(id)
                .orElseThrow();
    }

    public List<Post> getPostsByTitle(String title) {
        return postRepository.findByTitleContainingIgnoreCase(title);
    }
}
