package com.example.tpvendredi0202.repository;

import java.util.List;

public interface Repository <T> {
    boolean create(T o);

    boolean update(T o);

    boolean delete(T o);

    T findById(Long id);

    List<T> findAll();
}
