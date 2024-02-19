package com.example.demo_springH2mapper.repository;

import com.example.demo_springH2mapper.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PersonRepository  extends JpaRepository<Person, UUID> {
    List<Person> findAllByFirstNameStartingWith(String value);
    Long countAllByFirstNameStartingWith(String value);


}
