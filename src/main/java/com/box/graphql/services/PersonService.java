package com.box.graphql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.graphql.models.*;
import com.box.graphql.repositories.*;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;


    public Optional<Person> getPersonById(int uuid) {
        return personRepo.findById(uuid);
    }


    public List<Person> getPeople() {
        return personRepo.findAll();
    }

    public Person addPerson(String name, int age) {
        Person person = new Person();

        person.setName(name);
        person.setAge(age);

        return personRepo.save(person);
    }
}