package com.robertHalf.domain.repository;

import com.robertHalf.application.service.PersonService;
import com.robertHalf.domain.Person;
import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> findAll();
    Optional<Person> findById(Integer id);
    void save(Person person);
    void deleteById(Integer id);
}