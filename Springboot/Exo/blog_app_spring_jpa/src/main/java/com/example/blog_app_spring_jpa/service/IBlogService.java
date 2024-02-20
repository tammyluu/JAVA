package com.example.blog_app_spring_jpa.service;

import org.springframework.stereotype.Service;

import java.util.List;


public interface IBlogService <T>{
    List<T>  getAll();
     T getById(int id);

     T add(T element);

    void delete(int id);

     T update(T element);
}
