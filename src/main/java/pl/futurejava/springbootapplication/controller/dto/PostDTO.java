package pl.futurejava.springbootapplication.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class PostDTO {
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
}
