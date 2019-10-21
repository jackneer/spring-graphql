package com.box.graphql.repositories;

import org.springframework.data.jpa.repository.*;
import com.box.graphql.models.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}