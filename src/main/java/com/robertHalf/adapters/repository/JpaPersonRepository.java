package com.robertHalf.adapters.repository;

import com.robertHalf.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaPersonRepository implements PersonRepository {
    private final SpringDataPersonRepository repository;

    public JpaPersonRepository(SpringDataPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Person> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Person person) {
        repository.save(person);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
