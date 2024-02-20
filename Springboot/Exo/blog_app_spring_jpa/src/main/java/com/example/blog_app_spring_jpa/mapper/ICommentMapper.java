package com.example.blog_app_spring_jpa.mapper;

import com.example.blog_app_spring_jpa.dto.CommentDTO;
import com.example.blog_app_spring_jpa.entities.CommentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICommentMapper {
    CommentDTO commentEntityToCommentDto(CommentEntity comment);
    CommentEntity commentDtoTOCommentEntity(CommentDTO dto);
}
