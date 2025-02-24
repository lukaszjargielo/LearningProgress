package pl.futurejava.springbootapplication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/{postId}/comments/{commentId}")
public class CommentController {
}
