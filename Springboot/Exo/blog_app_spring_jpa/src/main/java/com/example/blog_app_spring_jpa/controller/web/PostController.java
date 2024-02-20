package com.example.blog_app_spring_jpa.controller.web;

import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.entities.PostEntity;
import com.example.blog_app_spring_jpa.service.PostServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    private final PostServiceImpl postService;
    @Value("IT-Edu")
    private String blogName;
    @Value("it_edu@edublog.edu")
    private String blogContact;
    @Autowired
    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }
    @GetMapping("/")  // http://localhost:8080
    public String home(Model model){
        model.addAttribute("name",blogName);
        model.addAttribute("contact",blogContact);
        return "home";
    }
    @GetMapping("/posts")
    public String getListPost(Model model){
        List<PostDTO> postDtos = postService.getAll();
        model.addAttribute("posts", postDtos);

        return "list";
    }
    @GetMapping(value = "/post/{postId}")
    public String showDetail(@PathVariable("postId") int id, Model model) {
       PostDTO postDto = postService.getById(id);
        model.addAttribute("post", postDto);
        return "detail";

    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("post", new PostEntity());
        return "post-form";
    }

    @PostMapping(value = "/add")
    public String addPost(@Valid @ModelAttribute("post")PostDTO postDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "post-form";
        } else {
            if (postDto.getId() != 0) {
                postService.update(postDto);
            } else {
                postService.add(postDto);
                System.out.println("save");
            }
            return "redirect:/posts";
        }
    }

    @GetMapping("/delete/{postId}")
    public String delete(@RequestParam("postId") int id) {
        postService.delete(id);
        System.out.println("delete");
        return "redirect:/posts";
    }

    @GetMapping("/update/{postId}")
    public String formUpdatePost(@PathVariable("postId") int id, Model model) {
       PostDTO postDto = postService.getById(id);
        model.addAttribute("post", postDto);
        return "post-form";
    }

}
