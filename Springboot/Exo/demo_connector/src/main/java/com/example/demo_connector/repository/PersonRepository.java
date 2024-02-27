package com.example.demo_connector.repository;

import com.example.demo_connector.entity.Person;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
@Repository
public interface PersonRepository extends R2dbcRepository<Person,Long > {

    Flux<Person> searchAllByFirstnameContainingIgnoreCase(String firstname);
    @Query("SELECT  id, firstname, lastname FROM  person where firstname like :search")
    Flux<Person> customSearch(String search);
}



