package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    @Override
    public List<Person> findAll() {

        return personRepository.findAll();
    }

    @Override
    public Person findById(int id) {
        return personRepository.getReferenceById(id);
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void update(int id, Person updatedPerson) {
        Person existingPerson = personRepository.findById(id).orElse(null);
        if (existingPerson != null) {
            existingPerson.setFirstName(updatedPerson.getFirstName());
            existingPerson.setLastName(updatedPerson.getLastName());
            existingPerson.setEmail(updatedPerson.getEmail());
            personRepository.save(existingPerson);
        }
        System.out.println("update");
    }

    @Override
    public Boolean deleteById(int id) {
        personRepository.deleteById(id);
        System.out.println("delete");
        return true;
    }
}
