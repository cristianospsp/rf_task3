package com.robertHalf.adapters.repository;

import com.robertHalf.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonRepository {

    List<Person> findAll();
    Optional<Person> findById(Integer id);
    void save(Person person);
    void deleteById(Integer id);

}