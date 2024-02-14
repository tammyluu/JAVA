package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/uni")
public class StudentRestController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.findAllStudents();
    }
}
