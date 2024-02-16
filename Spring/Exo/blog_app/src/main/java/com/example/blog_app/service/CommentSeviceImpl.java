package com.example.blog_app.service;

import com.example.blog_app.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class CommentSeviceImpl implements IBlogServcie<Comment> {

    @Override
    public List<Comment> getAll() {
        return null;
    }

    @Override
    public Comment getById(UUID id) {
        return null;
    }

    @Override
    public Boolean add(Comment entity) {
        return false;
    }

    @Override
    public Boolean deleteById(UUID id) {
        return false;
    }

    @Override
    public Comment update(UUID id, Comment element) {
        return null;
    }
}
