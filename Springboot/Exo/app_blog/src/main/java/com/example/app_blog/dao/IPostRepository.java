package com.example.app_blog.dao;


import com.example.app_blog.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<PostEntity, Integer> {
    PostEntity findPostEntityByIdIs(Integer id);
}
