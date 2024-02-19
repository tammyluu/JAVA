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
    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id") int id){
        return personService.findById(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable int id, @RequestBody Person updatedPerson){
        Person existingPerson = personService.findById(id);
        if(existingPerson == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        existingPerson.setFirstName(updatedPerson.getFirstName());
        existingPerson.setLastName(updatedPerson.getLastName());
        existingPerson.setEmail(updatedPerson.getEmail());

        personService.update(id, existingPerson);

        return new ResponseEntity<>(existingPerson, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable int id) {
        Person existingPerson = personService.findById(id);
        if(existingPerson == null) {
            return new ResponseEntity<>("Person with id " + id + " not found", HttpStatus.NOT_FOUND);
        }
        personService.deleteById(id);
        return new ResponseEntity<>("Person with id " + id + " deleted successfully", HttpStatus.OK);
    }


}
