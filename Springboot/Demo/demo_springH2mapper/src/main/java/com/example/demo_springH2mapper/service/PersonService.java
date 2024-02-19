package com.example.demo_springH2mapper.service;

import com.example.demo_springH2mapper.entities.Person;
import com.example.demo_springH2mapper.mapper.PersonMapper;
import com.example.demo_springH2mapper.model.PersonDTO;
import com.example.demo_springH2mapper.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private  final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }
    public List<PersonDTO> listPerson(){
        return personRepository.findAll().stream().map(personMapper::personToPersonDTO).toList();
        // :: appelle classe DTO et appliquer la méthodes
    }
    public PersonDTO addPerson(PersonDTO dto){
        //addPerson en Obj => dtoToPerson
       /* Person person = personMapper.personDtoToPerson(dto);
        Person savedPerson = personRepository.save(person);
        // pour enregistrer  dans BDD, transforme en person
        PersonDTO savedDto = personMapper.personToPersonDTO(savedPerson);
        return  savedDto;*/
        return personMapper.personToPersonDTO(personRepository.save(personMapper.personDtoToPerson(dto)));
    }

}
