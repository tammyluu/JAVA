package com.example.student.service;

import com.example.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class StudentService  implements IBaseService <Student>{
    private final Map<UUID, Student> students;

    public StudentService() {
       students = new HashMap<>();
        Student student1 = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Andy")
                .lastName("Lau")
                .age(23)
                .email("andy@gmail.com")
                .thumbnail("/static/images/andy lau.jpg")
                .build();
        Student student2 = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Jacky")
                .lastName("Chan")
                .age(20)
                .email("jacky@gmail.com")
                .thumbnail("/static/images/jacky.jpg")
                .build();
        Student student3 = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Lady")
                .lastName("Gaga")
                .age(19)
                .email("lady@hotmail.com")
                .thumbnail("/static/images/lady.jpg")
                .build();
        Student student4 = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Tom")
                .lastName("Cruise")
                .age(18)
                .email("tom@yahoo.com")
                .thumbnail("/static/images/tomcruise.jpg")
                .build();
        Student student5 = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Tom")
                .lastName("Micheal")
                .age(24)
                .email("tommicheal@yahoo.com")
                .thumbnail("/static/images/huynbin.jpg")
                .build();
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        students.put(student3.getId(),student3);
        students.put(student4.getId(),student4);
        students.put(student5.getId(),student5);

    }

    @Override
    public Boolean createStudent(Student student) {
        if (student.getId() ==null){
            student.setId(UUID.randomUUID());
            students.put(student.getId(),student);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Student> findAllStudents() {
        return students.values().stream().toList();
    }

    @Override
    public Student findStudentById(UUID id) {
        return students.values().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Student findStudentByName(String keyword) {
        return students.values().stream().filter(s -> s.getFirstName().equals(keyword)).findFirst().orElse(null);

    }
    public List<Student> findStudentsByFirstName(String keyword) {
        return students.values()
                .stream()
                .filter(s -> s.getFirstName().equals(keyword))
                .collect(Collectors.toList());
    }

    @Override
    public Student updateStudent(UUID id, Student student) {
        return null;
    }

    @Override
    public void deleteStudentById(UUID id) {

    }
}
