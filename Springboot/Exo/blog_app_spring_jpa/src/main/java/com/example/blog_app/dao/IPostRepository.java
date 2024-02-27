package com.example.blog_app.dao;

import com.example.blog_app.model.PostDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface IPostRepository extends JpaRepository<PostDTO, UUID> {
}
