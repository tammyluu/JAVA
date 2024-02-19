package com.example.demo_springData.service;

import com.example.demo_springData.dao.PersonRepository;
import com.example.demo_springData.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        System.out.println("bien ajouté");
    }
}
