package com.example.blog_app_spring_jpa.controller.APIRest;

import com.example.blog_app_spring_jpa.dto.CommentDTO;
import com.example.blog_app_spring_jpa.dto.PostDTO;
import com.example.blog_app_spring_jpa.service.CommentServiceImpl;
import com.example.blog_app_spring_jpa.service.PostServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CommentRestController {
    private final PostServiceImpl postService;
    private final CommentServiceImpl commentService;
    @Autowired
    public CommentRestController(PostServiceImpl postService, CommentServiceImpl commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }
    @GetMapping("/comments")
    public List<CommentDTO> getAllComments(){
        return commentService.getAll();
    }

    @PostMapping("/add/{postId}")
    public ResponseEntity<String> addComment(@RequestBody CommentDTO commentDto, @PathVariable("postId") int id){
        PostDTO postDto = postService.getById(id);
        System.out.println(commentDto);
        boolean isCommentAdded = commentService.addCommentToPost(postDto, commentDto);
        if(isCommentAdded) {
            return ResponseEntity.ok("Comment added successfully");
        } else {
            return ResponseEntity.badRequest().body("Failed to add comment");
        }
    }
    @PostMapping("/addComment/{postId}") // http://localhost:8080/api/blog/addComment/x
    public ResponseEntity<String> createCommentValid(@Valid @RequestBody CommentDTO comment, BindingResult result, @PathVariable("postId") int id){
        if(result.hasErrors()){
            StringBuilder errors = new StringBuilder();
            result.getAllErrors().forEach(objectError -> errors.append(objectError.toString() + " , "));

            return new ResponseEntity<>(errors.toString(), HttpStatus.BAD_REQUEST);
        }
        PostDTO postDto = postService.getById(id);
        commentService.addCommentToPost(postDto,comment);
        return new ResponseEntity<>("Comments created with id  : "+comment.getId(), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteComment(@PathVariable int id){
         commentService.delete(id);
        System.out.println("Comment deleted");

    }

    @PutMapping("/update")
    public void updateComment(@RequestBody CommentDTO commentDto){
        commentService.update(commentDto);
    }

    @PutMapping("/updatecomment/{id}")
    public ResponseEntity<String> updatePostValid(@PathVariable int id,@Valid @RequestBody CommentDTO commentDto,BindingResult result){
        if(result.hasErrors()){
            StringBuilder errors = new StringBuilder();
            result.getAllErrors().forEach(objectError -> errors.append(objectError.toString() + " , "));

            return new ResponseEntity<>(errors.toString(), HttpStatus.BAD_REQUEST);
        }
        commentService.update(commentDto);
        return new  ResponseEntity<>("comment modified is ok", HttpStatus.ACCEPTED);
    }

}
