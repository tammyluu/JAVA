package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @GetMapping
    public String homePage(){
        return "home";
    }
    @GetMapping("/detail/{studentId}")
    public String showStudentProfil(@PathVariable("studentId")UUID id, Model model){
        Student aStudent = studentService.findStudentById(id);
        model.addAttribute("student", aStudent);
        return "detail";
    }
    @GetMapping("/list")
    public String showAllStudents(Model model)   {

        List<Student> studentList = studentService.findAllStudents();


        model.addAttribute("students", studentList);

        return "students";
    }
    @GetMapping("/add")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "form";
    }
    @PostMapping("/add")
    public  String saveStudent(@ModelAttribute("student")Student student){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        studentService.createStudent(student);
        return "redirect:/";
    }
    @GetMapping("/search")
    public String  showOneStudentByName (@RequestParam(name="keyword",defaultValue = "" )String keyword, Model model){
        System.out.println(keyword);
        Student student = studentService.findStudentByName(keyword);

        if (student != null){
            model.addAttribute("student", student);
            return "detail";
        }else
            return "error";
    }

    @GetMapping("/search")
    public String  sortStudentsByName (@RequestParam(name="keyword",defaultValue = "" )String keyword, Model model){
        System.out.println(keyword);
        List<Student> students = studentService.findStudentsByFirstName(keyword);

        if (students != null){
            model.addAttribute("students", students);
            return "list";
        }else
            return "error";
    }


}

