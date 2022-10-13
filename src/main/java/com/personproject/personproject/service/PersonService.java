package com.personproject.personproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.personproject.personproject.entities.Person;

@Service
public class PersonService {

  List<Person> listOfPerson;  

  @Autowired
  PersonRepository personRepository;

  public String helloTest(){
      return "helloTest";
  }

  public void addPerson(String firstName, String lastName, int age){
      listOfPerson.add(new Person(firstName,lastName,age));
  }

  public List<Person> getAll(){
      return this.listOfPerson;
  }
  
}
