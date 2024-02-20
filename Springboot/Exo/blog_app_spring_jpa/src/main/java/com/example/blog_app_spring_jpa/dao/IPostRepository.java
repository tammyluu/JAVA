package com.example.blog_app_spring_jpa.dao;

import com.example.blog_app_spring_jpa.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<PostEntity, Integer> {
    PostEntity findPostEntityByIdIs(Integer id);
}
