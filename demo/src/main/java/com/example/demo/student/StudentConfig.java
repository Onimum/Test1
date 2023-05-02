package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kushtar = new Student(
                    1L,
                    "Kushtar",
                    "kushtar@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 12),
                    19);

            Student zhalgas = new Student(
                    2L,
                    "Zhalgas",
                    "zhalgas@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 12),
                    19);

            repository.saveAll(
                    List.of(kushtar, zhalgas)
            );
        };
    }
}
