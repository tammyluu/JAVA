package com.example.student.service;

import com.example.student.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService  implements IBaseService {
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
        return (Student) students
                .values()
                .stream()
                .filter(s -> s.getFirstName().toLowerCase().contains(keyword.toLowerCase())
                || s.getLastName().toLowerCase().contains(keyword.toLowerCase()));

    }


    @Override
    public List<Student> searchStudents(String search) {
        String searchLower = search.toLowerCase();

        return students
                .values()
                .stream()
                .filter(student ->
                        student.getLastName().toLowerCase().contains(searchLower) ||
                                student.getFirstName().toLowerCase().contains(searchLower))
                .toList();
    }

    public List<Student> findStudentsByFirstName(String keyword) {
        return students.values()
                .stream()
                .filter(s -> s.getFirstName().equals(keyword))
                .collect(Collectors.toList());
    }

    @Override
    public Student updateStudent(UUID id, Student student) {
        if (students.containsKey(id)) {
            Student existingStudent = students.get(id);
           existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setAge(student.getAge());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setThumbnail(student.getThumbnail());
            System.out.println("update student");
            return existingStudent;

        } else {
            System.out.println("Student not found");
             return null;
        }
    }

    @Override
    public void deleteStudentById(UUID id) {
        if(id != null && students.containsKey(id)) {
            students.remove(id);
            System.out.println("student removed successful");
        } else {
            System.out.println("student not found");
        }
    }
}
