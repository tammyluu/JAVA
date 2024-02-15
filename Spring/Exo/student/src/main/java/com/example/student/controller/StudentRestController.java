package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/uni")
public class StudentRestController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.findAllStudents();
    }
    @GetMapping("/student/{id}")
    public  Student getStudent(@PathVariable("id") UUID id){
        System.out.println(studentService.findStudentById(id));
        return studentService.findStudentById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deletedStudentByID(@PathVariable("id") UUID id){
         studentService.deleteStudentById(id);
        System.out.println("delete student successful");
    }
    @PutMapping("/update/{id}")
    public void updateStudentByID(@PathVariable("id")UUID id, Student student){
        studentService.updateStudent(id, student);
        System.out.println("student update successful");
    }


}
