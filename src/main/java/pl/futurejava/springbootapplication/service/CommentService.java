package pl.futurejava.springbootapplication.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.futurejava.springbootapplication.repository.CommentRepository;
import pl.futurejava.springbootapplication.repository.PostRepository;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
}
