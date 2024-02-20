package com.example.blog_app_spring_jpa.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommentDTO {
    private int id;

    private String fullName;

    private String email;

    private String content;
    private PostDTO post;

    public CommentDTO() {
    }

    public CommentDTO(int id, String fullName, String email, String content) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PostDTO getPost() {
        return post;
    }

    public void setPost(PostDTO post) {
        this.post = post;
    }
}
