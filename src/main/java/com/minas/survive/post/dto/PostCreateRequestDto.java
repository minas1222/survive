package com.minas.survive.post.dto;

import jakarta.validation.constraints.NotBlank;


public class PostCreateRequestDto {

    @NotBlank(message = "제목은 공백일 수 없습니다.")
    public String title;

    @NotBlank(message = "내용은 공백일 수 없습니다.")
    public String context;
}