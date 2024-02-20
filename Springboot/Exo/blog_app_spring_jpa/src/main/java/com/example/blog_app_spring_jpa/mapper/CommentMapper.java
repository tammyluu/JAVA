package com.example.blog_app_spring_jpa.mapper;


import com.example.blog_app_spring_jpa.dto.CommentDTO;
import com.example.blog_app_spring_jpa.entities.CommentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
   /* @Mapping(source = "fullName", target = "fullName")
     CommentDTO commentEntityToCommentDto(CommentEntity comment);

    @Mapping(source = "fullName", target = "fullName")
     CommentEntity commentDtoTOCommentEntity(CommentDTO dto);*/

    private ModelMapper modelMapper;
    public CommentDTO commentEntityToCommentDto(CommentEntity comment){
        CommentDTO result = modelMapper.map(comment, CommentDTO.class);
        return result;
    }
    public  CommentEntity commentDtoTOCommentEntity(CommentDTO dto){
        CommentEntity result = modelMapper.map(dto, CommentEntity.class);
        return result;
    }
}
