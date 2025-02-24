package pl.futurejava.springbootapplication.controller;

import pl.futurejava.springbootapplication.controller.dto.PostDTO;
import pl.futurejava.springbootapplication.model.Post;
import java.util.List;

public class PostDtoMapper {

    private PostDtoMapper() {
    }

    public static List<PostDTO> mapToPostDtos(List<Post> posts) {
        return posts.stream()
                .map(PostDtoMapper::maptoPostDto)
                .toList();
    }

    public static PostDTO maptoPostDto(Post post) {
        return PostDTO.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .created(post.getCreated())
                .build();
    }
}
