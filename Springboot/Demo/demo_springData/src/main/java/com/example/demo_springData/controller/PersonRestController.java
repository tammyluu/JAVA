package com.example.demo_springData.controller;

import com.example.demo_springData.entity.Person;
import com.example.demo_springData.service.PersonService;
import jakarta.persistence.GeneratedValue;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonRestController {
    private PersonService personService;
    @GetMapping("/list")
    public List<Person> getAllPersons(){
        return personService.findAll();
    }
    @GetMapping("/addoneperson")
    public void addOnePerson(){
        personService.save(Person.builder().firstName("toto").lastName("titi").email("toto@example.com").build());
    }

}
