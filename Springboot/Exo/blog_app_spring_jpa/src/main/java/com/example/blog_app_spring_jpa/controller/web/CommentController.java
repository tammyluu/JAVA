package com.example.blog_app_spring_jpa.controller.web;

import com.example.blog_app_spring_jpa.dto.CommentDTO;
import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.entities.CommentEntity;
import com.example.blog_app_spring_jpa.service.CommentServiceImpl;
import com.example.blog_app_spring_jpa.service.PostServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {
    private final PostServiceImpl postService;
    private final CommentServiceImpl commentService;

    @Autowired
    public CommentController(PostServiceImpl postService, CommentServiceImpl commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }
    @GetMapping("/addComment/{postId}")
    public String showCommentForm(@PathVariable("postId") int postId, Model model) {
        model.addAttribute("comment", new CommentEntity());
        model.addAttribute("postId", postId);
        return "comment-form";
    }

    @PostMapping(value = "/addComment/{postId}")
    public String addComment(@Valid @ModelAttribute("comment") CommentDTO commentDto, BindingResult bindingResult, @PathVariable("postId") int id) {
        if (bindingResult.hasErrors()) {
            return "comment-form";
        } else {
            PostDTO postDto = postService.getById(id);
            if (postDto != null) {
                System.out.println(commentDto.getFullName());
                commentService.addCommentToPost(postDto, commentDto);
                return "redirect:/";
            }
            return "comment-form";
        }
    }

}
