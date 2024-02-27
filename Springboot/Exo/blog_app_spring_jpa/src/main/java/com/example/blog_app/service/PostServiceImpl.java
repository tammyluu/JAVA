package com.example.blog_app.service;

import com.example.blog_app.dao.ICommentRepository;
import com.example.blog_app.dao.IPostRepository;
import com.example.blog_app.entities.Comment;
import com.example.blog_app.entities.Post;
import com.example.blog_app.model.CommentDTO;
import com.example.blog_app.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostServiceImpl implements IBlogServcie<Post> {

    private IPostRepository postRepository;
    private ICommentRepository commentRepository;
    
    @Autowired
    public PostServiceImpl(IPostRepository postRepository, ICommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }


    public boolean addComment(Post post, Comment comment) {
        List<Comment> comments = post.getComments();
        comments.add(comment);
        return true;
    }

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Post getById(UUID id) {
        return postRepository.findById(id);
    }

    @Override
    public Post save(Post element) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Post update(Post element) {
        return null;
    }
}
