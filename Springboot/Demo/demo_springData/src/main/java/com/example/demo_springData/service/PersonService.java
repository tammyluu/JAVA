package com.example.demo_springData.service;

import com.example.demo_springData.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person findById(int id);
    void save(Person person);
}
