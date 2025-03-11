package com.minas.survive.post.service;

import com.minas.survive.post.dto.PostResponseDto;
import com.minas.survive.post.entity.Post;
import com.minas.survive.post.repository.PostRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostService {

  @Autowired
  private PostRepository postRepository;

  @Transactional(readOnly = true)
  public PostResponseDto findById(String id) {
    Post post = this.postRepository.findById(id).orElseThrow(null);
    return PostResponseDto.from(post);
  }
}
