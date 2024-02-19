package com.example.demo.controller;


import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonRestController {

    private PersonService personService;

    @GetMapping("/list")
    public List<Person> getAllPersons(){
        return personService.findAll();
    }

    @GetMapping("/addoneperson")
    public void addOnePerson(){
        personService.save(Person.builder()
                .firstName("toto")
                .lastName("tata")
                .email("toto@tata.com")
                .build());
    }
    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person){
        System.out.println("ajouté");
        return personService.save(person);
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable("id") int id){
        return personService.findById(id);
    }
    @PutMapping("/update/")
    public void updatePerson( @RequestBody Person person){
        personService.update(person);
        System.out.println("update");
    }
    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable int id) {
        personService.deleteById(personService.findById(id));
    }


}
