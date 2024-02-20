package com.example.blog_app_spring_jpa.mapper;
import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.entities.PostEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface IPostMapper {
    PostDTO postEntittyToPostDTO(PostEntity post);
    PostEntity postDtoToPostEntity(PostDTO dto);
}
