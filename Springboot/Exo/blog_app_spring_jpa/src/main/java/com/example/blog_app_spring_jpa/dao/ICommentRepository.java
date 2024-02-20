package com.example.blog_app_spring_jpa.dao;

import com.example.blog_app_spring_jpa.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepository extends JpaRepository<CommentEntity, Integer> {
    CommentEntity findCommentEntitiesByIdIs(Integer id);
}
