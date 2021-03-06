package com.liquibase.liquibase.controller;


import com.liquibase.liquibase.entity.Person;
import com.liquibase.liquibase.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("person")
    public void createPreson(@RequestParam String name){
        personRepository.save(new Person(name, "6.7", "hello"));
    }

    @GetMapping("person")
    public List<Person> getAllThePeople(){
        return (List<Person>) personRepository.findAll();
    }

}
