package com.example.blog_app_spring_jpa.mapper;
import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.entities.PostEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.modelmapper.ModelMapper;

//@Mapper(componentModel = "spring")
public class PostMapper {
  //  @Mapping(source = "title", target = "title")
  private ModelMapper modelMapper;
    public PostDTO postEntittyToPostDTO(PostEntity post){
      PostDTO result = modelMapper.map(post, PostDTO.class);
      return result;
    };
  //  @Mapping(source = "title", target = "title")
   public  PostEntity postDtoToPostEntity(PostDTO dto){
     PostEntity result = modelMapper.map(dto, PostEntity.class);
     return result;
   };
}
