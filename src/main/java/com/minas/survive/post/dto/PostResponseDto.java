package com.minas.survive.post.dto;

import com.minas.survive.post.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PostResponseDto {
    private Long id;
    private String title;
    private String context;

    public static PostResponseDto from(Post post) {
        return new PostResponseDto(
            post.getId(),
            post.getTitle(),
            post.getContext());
    }
}
