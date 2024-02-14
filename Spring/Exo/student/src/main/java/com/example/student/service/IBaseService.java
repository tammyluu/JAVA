package com.example.student.service;

import com.example.student.model.Student;

import java.util.List;
import java.util.UUID;

public interface IBaseService <T>{
    Boolean createStudent( T element);
    List<T> findAllStudents();
    T findStudentById(UUID id);
    T findStudentByName(String firstName);
    T updateStudent(UUID id, T element);
    void deleteStudentById(UUID id);


}
