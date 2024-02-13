package com.example.student.controller;

import com.example.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    

}

