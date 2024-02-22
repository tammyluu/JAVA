package com.example.blog_app_spring_jpa.service;

import com.example.blog_app_spring_jpa.dao.ICommentRepository;
import com.example.blog_app_spring_jpa.dao.IPostRepository;
import com.example.blog_app_spring_jpa.dto.CommentDTO;
import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.entities.CommentEntity;
import com.example.blog_app_spring_jpa.mapper.CommentMapper;

import com.example.blog_app_spring_jpa.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl  implements IBlogService<CommentDTO> {
    private final ICommentRepository commentRepository;

    private final IPostRepository postRepository;
    private final CommentMapper commentMapper;
    private final PostMapper postMapper;
    @Autowired
    public CommentServiceImpl(ICommentRepository commentRepository, IPostRepository postRepository, CommentMapper commentMapper, PostMapper postMapper) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
        this.commentMapper = commentMapper;
        this.postMapper = postMapper;
    }

    @Override
    public List<CommentDTO> getAll() {
        return commentRepository.findAll().stream().map(commentMapper::commentEntityToCommentDto).collect(Collectors.toList());
    }

    @Override
    public CommentDTO getById(int id) {
        return commentMapper.commentEntityToCommentDto(commentRepository.findCommentEntitiesByIdIs(id));
    }

    @Override
    public CommentDTO add(CommentDTO dto) {
        return commentMapper.commentEntityToCommentDto(commentRepository.save(commentMapper.commentDtoTOCommentEntity(dto)));
    }

    @Override
    public void delete(int id) {
        CommentDTO commentDto = getById(id);
        commentRepository.delete(commentMapper.commentDtoTOCommentEntity(commentDto));
        System.out.println("delete");

    }

    @Override
    public CommentDTO update(CommentDTO dto) {
        return  commentMapper.commentEntityToCommentDto(commentRepository.save(commentMapper.commentDtoTOCommentEntity(dto)));
    }
    public boolean addCommentToPost(PostDTO postDto, CommentDTO commentDto) {
        CommentEntity commentAdding = commentMapper.commentDtoTOCommentEntity(commentDto);
        commentAdding.setFullName(commentDto.getFullName());
        commentAdding.setEmail(commentDto.getEmail());
        commentAdding.setContent(commentDto.getContent());

        commentAdding.setPost(postMapper.postDtoToPostEntity(postDto));

        commentRepository.save(commentAdding);
        return true;
    }
}
