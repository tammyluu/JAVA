package com.example.demo.service;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(int id);

    void save(Person person);
    void  update(int id, Person person);
    Boolean deleteById(int id);
}
