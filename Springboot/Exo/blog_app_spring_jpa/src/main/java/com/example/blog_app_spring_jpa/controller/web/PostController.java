package com.example.blog_app_spring_jpa.controller.web;

import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.entities.PostEntity;
import com.example.blog_app_spring_jpa.service.PostServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    private final PostServiceImpl postService;
    @Autowired
    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }
    @GetMapping
    public String home(Model model) {
        List<PostDTO> postDtos = postService.getAll();
        model.addAttribute("posts");
        return "home";
    }
    @GetMapping(value = "/detail/{postId}")
    public String showDetail(@PathVariable("postId") int id, Model model) {
       PostDTO postDto = postService.getById(id);
        model.addAttribute("post", postDto);
        return "detail";

    }

    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("post", new PostEntity());
        return "post-form";
    }

    @PostMapping(value = "/add")
    public String addPost(@Valid @ModelAttribute("post")PostDTO postDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "postForm";
        } else {
            if (postDto.getId() != 0) {
                postService.update(postDto);
            } else {
                postService.add(postDto);
            }
            return "redirect:/list";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("postId") int id) {
        postService.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/update/{postId}")
    public String formUpdatePost(@PathVariable("postId") int id, Model model) {
       PostDTO postDto = postService.getById(id);
        model.addAttribute("post", postDto);
        return "post-form";
    }

}
