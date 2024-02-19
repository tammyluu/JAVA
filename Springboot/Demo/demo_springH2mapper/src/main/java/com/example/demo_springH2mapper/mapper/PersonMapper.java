package com.example.demo_springH2mapper.mapper;

import com.example.demo_springH2mapper.entities.Person;
import com.example.demo_springH2mapper.model.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDate;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    @Mapping(source = "firstName", target = "blabla")
    @Mapping(source = "birthDate" ,target = "age", qualifiedByName ="converDateToAge" )
    PersonDTO personToPersonDTO(Person person);

    @Mapping(source = "blabla", target = "firstName")
    Person personDtoToPerson(PersonDTO personDTO);
    @Named("convertDateToAge")
    public static  Integer convertDateToAge(LocalDate date){
        LocalDate now = LocalDate.now();
        Integer age = now.getYear() - date.getYear();
        if(now.minusYears(age).isBefore(date)){
            // à dater la date de l'anniverssaire
            age--;
        }
        return age;
    }

}
