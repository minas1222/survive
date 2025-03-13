package com.minas.survive.post.service;

import com.minas.survive.post.dto.PostCreateRequestDto;
import com.minas.survive.post.dto.PostResponseDto;

import com.minas.survive.post.entity.Post;
import com.minas.survive.post.repository.PostRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional(readOnly = true)
    public PostResponseDto findById(Long id) {
        Post post = this.postRepository.findById(id).orElseThrow(null);
        return PostResponseDto.from(post);
    }

    @Transactional
    public PostResponseDto createPost(PostCreateRequestDto dto) {

        Post post = this.postRepository.save(Post.of(dto.title, dto.context));
        
        return PostResponseDto.from(post);
    }
}
