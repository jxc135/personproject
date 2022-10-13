package com.personproject.personproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//Need to include lines 4-6 and include stuff in pom.xml to make the @Size, @Min and @Max to work
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.*;
//import org.springframework.stereotype.Component;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    @Size(min=2,max=30)
    private String firstName;
    private String lastName;
    
    @Min(18)
    @Max(75)
    private int age;

    public Person(){
    }

    public Person(String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLasttName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLasttName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }

}

