package com.laboratory.Flyway.repository;

import com.laboratory.Flyway.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepositoy extends JpaRepository<Person, Long> {
}
