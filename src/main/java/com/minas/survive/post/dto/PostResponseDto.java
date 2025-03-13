package com.minas.survive.post.dto;

import com.minas.survive.post.entity.Post;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostResponseDto {
  private String id;
  private String title;
  private String context;

  public static PostResponseDto from(Post post) {
    return new PostResponseDto(
        post.id,
        post.title,
        post.context);
  }
}
