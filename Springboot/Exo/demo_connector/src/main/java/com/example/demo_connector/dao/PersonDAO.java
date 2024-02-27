package com.example.demo_connector.dao;

import com.example.demo_connector.entity.Person;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;



@Component
public class PersonDAO {
    private ConnectionFactory connectionFactory;
    private DatabaseClient databaseClient;

    public PersonDAO(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
        databaseClient = DatabaseClient.create(connectionFactory);
        Mono result = databaseClient
                .sql("CREATE TABLE IF NOT EXISTS person(id int primary key auto_increment, firstname varchar(100), lastname varchar(100)); CREATE TABLE IF NOT EXISTS address (id int primary key auto_increment, full_Address varchar(100), person_Id int);")
                .then().doOnSuccess((Void) -> {
                    System.out.println("Creation table is OK");
                }).doOnError((Void) -> {
                    System.out.println("Creation table is KO");
                });
        result.subscribe();
    }

    public Flux<Person> getAll() {
        return databaseClient.sql("SELECT * FROM person")
                //  fetch convertir en flux
                .fetch()
                .all()
                // map convertir en person
                .map(m -> Person.builder()
                        // ne sait pas de type exact, c'est ns caster l'id est int
                        .id(Integer.valueOf(m.get("id").toString()))
                        .firstname(m.get("firstname").toString())
                        .lastname(m.get("lastname").toString())
                        .build());
    }

    public Mono add(String firstname, String lastname) {
        // on ajoute Mono et fetch().one() pour verify ça passe data
        Map<String, Object> values = new HashMap<>();
        values.put("firstname", firstname);
        values.put("lastname", lastname);
        Mono result = databaseClient.sql("INSERT INTO person (firstname, lastname) values (:firstname, :lastname)")
                //.bind("firstname", firstname).bind("lastname", lastname)
                .bindValues(values)
                .then();
        return result;
    }

    public Mono delete(int id) {
        return databaseClient.sql("DELETE FROM person WHERE id = :id")
                .bind("id", id)
                .then();
    }

    public Mono<Long> update(int id, String firstname, String lastname ) {
        Map<String, Object> values = new HashMap<>();
        values.put("firstname", firstname);
        values.put("lastname", lastname);
        values.put("id", id);
        return databaseClient
                .sql("UPDATE person SET firstname = :firstname, lastname = :lastname WHERE id = :id")
                .bindValues(values)
                .fetch()
                .rowsUpdated();


    }
}