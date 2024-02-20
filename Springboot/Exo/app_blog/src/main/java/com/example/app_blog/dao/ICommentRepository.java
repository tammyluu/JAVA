package com.example.app_blog.dao;


import com.example.app_blog.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepository extends JpaRepository<CommentEntity, Integer> {
    CommentEntity findCommentEntitiesByIdIs(Integer id);
}
