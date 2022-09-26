package com.personproject.personproject.repository;

import org.springframework.stereotype.Repository;

import com.personproject.personproject.entities.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {


}
