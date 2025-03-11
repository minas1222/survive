package com.minas.survive.post.controller;

import com.minas.survive.post.dto.PostResponseDto;
import com.minas.survive.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping("/{id}")
  public PostResponseDto findById(
    @PathVariable String id
  ) {
    return this.postService.findById(id);
  }
  
}
