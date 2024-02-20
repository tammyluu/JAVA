package com.example.blog_app_spring_jpa.controller.APIRest;

import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.service.CommentServiceImpl;
import com.example.blog_app_spring_jpa.service.PostServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostRestController {
    public final PostServiceImpl postService;
    private final CommentServiceImpl commentService;
    @Autowired
    public PostRestController(PostServiceImpl postService, CommentServiceImpl commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }
    @GetMapping("/post/{id}") // http://localhost:8080/api/blog/post/x
    public PostDTO getPostById(@PathVariable("id") int id){
        return postService.getById(id);
    }

    @PostMapping("/addPost") // http://localhost:8080/api/blog/addPost
    public boolean createPost(@RequestBody PostDTO post){
        PostDTO postDto =  postService.add(post);
        if(postDto != null) {
            return true;
        }
        return false;
    }

    @PostMapping("/addPost/verif") // http://localhost:8080/api/blog/addPost
    public ResponseEntity<String> createPostValid(@Valid @RequestBody PostDTO postDto, BindingResult result){
        if(result.hasErrors()){
            StringBuilder errors = new StringBuilder();
            result.getAllErrors().forEach(objectError -> errors.append(objectError.toString() + " , "));

            return new ResponseEntity<>(errors.toString(), HttpStatus.BAD_REQUEST);
        }
        postService.add(postDto);
        return new ResponseEntity<>("Post created with id : "+postDto.getId(), HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{id}")
    public void deletePost(@PathVariable int id){
        postService.delete(id);
    }

    @PutMapping("/update")
    public void updatePost(@RequestBody PostDTO postDto){
        postService.update(postDto);
        System.out.println("Update is ok");
    }

    @PutMapping("/update/post/verif/{id}") // http://localhost:8080/api/v1/blog/update/post/x
    public ResponseEntity<String> updatePostValid(@PathVariable int id,@Valid @RequestBody PostDTO updatePost,BindingResult result){
        if(result.hasErrors()){
            StringBuilder errors = new StringBuilder();
            result.getAllErrors().forEach(objectError -> errors.append(objectError.toString() + " , "));

            return new ResponseEntity<>(errors.toString(), HttpStatus.BAD_REQUEST);
        }
        postService.update(updatePost);
        return new  ResponseEntity<>("Post modified is OK", HttpStatus.ACCEPTED);
    }

}
