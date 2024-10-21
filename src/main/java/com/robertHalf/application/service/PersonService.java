package com.robertHalf.application.service;

import java.util.List;
import java.util.Optional;

import com.robertHalf.adapters.repository.PersonRepository;
import com.robertHalf.domain.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Optional<Person> findById(Integer id) {
        return personRepository.findById(id);
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public void deleteById(Integer id) {
        personRepository.deleteById(id);
    }

}
