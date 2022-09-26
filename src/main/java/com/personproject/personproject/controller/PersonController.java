package com.personproject.personproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.personproject.personproject.entities.*;
import com.personproject.personproject.service.PersonService;

@RestController
public class PersonController {
    
    @Autowired
    private PersonService personService;
    

    public PersonController(){
        
    }

    @RequestMapping("/test")
    public String helloTest(){
        return personService.helloTest();
    }

    @PostMapping("/post")
    public void addPerson(String firstName, String lastName, int age){
        personService.addPerson(firstName, lastName, age);
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return personService.getAll();
    }

}
