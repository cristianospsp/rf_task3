package com.robertHalf.adapters.repository;

import com.robertHalf.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataPersonRepository extends JpaRepository<Person, Integer> {
}
