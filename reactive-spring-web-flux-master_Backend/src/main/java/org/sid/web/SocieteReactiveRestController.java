package org.sid.web;

import org.sid.dao.SocieteRepository;
import org.sid.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
public class SocieteReactiveRestController {
    @Autowired
    private SocieteRepository societeRepository;
    @GetMapping(value = "/societes") //localhost:8080/societes
    public Flux<Societe> findAll(){
        return societeRepository.findAll();
    }
    @GetMapping(value = "/societes/{id}")//localhost:8080/societes/SG
    public Mono<Societe> getOne(@PathVariable String id){
        return societeRepository.findById(id);
    }
    @PostMapping("/societes") //localhost:8080/societes
    public Mono<Societe> save(@RequestBody Societe societe){
        return societeRepository.save(societe);
    }
    @DeleteMapping(value = "/societes/{id}") //localhost:8080/societes/xxx
    public Mono<Void> delete(@PathVariable String id){
        return societeRepository.deleteById(id);
    }
    @PutMapping("/societes/{id}") //localhost:8080/societes/xxx
    public Mono<Societe> update(@RequestBody Societe societe, @PathVariable String id){
        societe.setId(id);
        return societeRepository.save(societe);
    }

}