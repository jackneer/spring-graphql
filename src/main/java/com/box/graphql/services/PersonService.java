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
}