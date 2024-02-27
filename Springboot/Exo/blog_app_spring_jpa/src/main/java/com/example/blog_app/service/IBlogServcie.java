package com.example.blog_app.service;

import java.util.List;
import java.util.UUID;

public interface IBlogServcie <T> {
    List<T> getAll();
    T getById(UUID id);
    T  save(T element);
    void deleteById(UUID id);
    T update(T element);
}
