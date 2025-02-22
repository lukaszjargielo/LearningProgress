package pl.futurejava.springbootapplication.controller;

import pl.futurejava.springbootapplication.controller.dto.PostDto;
import pl.futurejava.springbootapplication.model.Post;

import java.util.List;
import java.util.stream.Collectors;

public class PostDtoMapper {

    private PostDtoMapper() {
    }

    public static List<PostDto> maptoPostDtos(List<Post> posts) {
        return posts.stream()
                .map(post -> maptoPostDto(post))
                .collect(Collectors.toUnmodifiableList());
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
