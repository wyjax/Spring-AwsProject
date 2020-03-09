package com.jungki.book.springboot.web.dto;

import com.jungki.book.springboot.domain.posts.Posts;
import lombok.Getter;
import org.omg.CORBA.PRIVATE_MEMBER;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts posts) {
        this.id = posts.getId();
        this.title = posts.getTitle();
        this.content = posts.getContent();
        this.author = posts.getAuthor();
    }
}
