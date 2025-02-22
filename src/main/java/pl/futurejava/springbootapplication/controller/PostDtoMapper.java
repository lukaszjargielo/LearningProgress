package pl.futurejava.springbootapplication.controller;

import pl.futurejava.springbootapplication.controller.dto.PostDto;
import pl.futurejava.springbootapplication.model.Post;
import java.util.List;

public class PostDtoMapper {

    private PostDtoMapper() {
    }

    public static List<PostDto> mapToPostDtos(List<Post> posts) {
        return posts.stream()
                .map(PostDtoMapper::maptoPostDto)
                .toList();
    }

    public static PostDto maptoPostDto(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .created(post.getCreated())
                .build();
    }
}
