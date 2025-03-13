package com.minas.survive.post.controller;

import com.minas.survive.post.dto.PostResponseDto;
import com.minas.survive.post.service.PostService;
import com.minas.survive.post.dto.PostCreateRequestDto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {

    private final PostService postService;

    @GetMapping("/{id}")
    public PostResponseDto findById(
        @PathVariable Long id
    ) {
        return this.postService.findById(id);
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public PostResponseDto create(
        @RequestBody @Valid PostCreateRequestDto dto
    ) {    
        return this.postService.createPost(dto);
    }
    
}
