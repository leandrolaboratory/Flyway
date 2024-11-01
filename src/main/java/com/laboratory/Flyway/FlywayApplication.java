package com.laboratory.Flyway;

import com.laboratory.Flyway.repository.PersonRepositoy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayApplication implements CommandLineRunner {
	private PersonRepositoy personRepositoy;

	public static void main(String[] args) {
		SpringApplication.run(FlywayApplication.class, args);
	}

	public FlywayApplication(PersonRepositoy personRepositoy) {
		this.personRepositoy = personRepositoy;
	}

	@Override
	public void run(String...arg){
		personRepositoy.findAll().forEach(System.out::println);
	}

}
