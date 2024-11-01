package com.laboratory.Flyway.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name = "PERSON")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    @Id
    private Long id;

    private String name;


}
