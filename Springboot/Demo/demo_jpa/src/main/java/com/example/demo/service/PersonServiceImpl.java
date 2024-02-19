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
       // return personRepository.findByIdIs(id);
        Optional<Person> result = personRepository.findById(id);
        /*if (result.isPresent()){
            return result.get();
        }*/
        return  result.orElse(null);
    }

    @Override
    public Person save(Person person) {
        personRepository.save(person);
        return  person;
    }

    @Override
    public Person update( Person updatedPerson) {
        personRepository.save(updatedPerson);
        return updatedPerson;

    }

    @Override
    public void deleteById(Person person) {
        personRepository.deleteById(person.getId());
        System.out.println("delete");

    }
}
