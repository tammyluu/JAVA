package com.example.blog_app_spring_jpa.service;

import com.example.blog_app_spring_jpa.dao.ICommentRepository;
import com.example.blog_app_spring_jpa.dao.IPostRepository;
import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.entities.PostEntity;
import com.example.blog_app_spring_jpa.mapper.IPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements IBlogService <PostDTO>{
    public final IPostRepository postRepository;
    public final IPostMapper postMapper;
    @Autowired
    public PostServiceImpl(IPostRepository postRepository, IPostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }


    @Override
    public List<PostDTO> getAll() {
        return postRepository.findAll().stream().map(postMapper::postEntittyToPostDTO).collect(Collectors.toList());
    }

    @Override
    public PostDTO getById(int id) {
        return postMapper.postEntittyToPostDTO(postRepository.findPostEntityByIdIs(id));
    }

    @Override
    public PostDTO add(PostDTO dto) {
        return postMapper.postEntittyToPostDTO(postRepository.save(postMapper.postDtoToPostEntity(dto)));
    }

    @Override
    public void delete(int id) {
        PostDTO postDTO = getById(id);
        postRepository.delete(postMapper.postDtoToPostEntity(postDTO));
        System.out.println("delete");
    }

    @Override
    public PostDTO update(PostDTO dto) {
        return postMapper.postEntittyToPostDTO(postRepository.save(postMapper.postDtoToPostEntity(dto)));
    }
}
