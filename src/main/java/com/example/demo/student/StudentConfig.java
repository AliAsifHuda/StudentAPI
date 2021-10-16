package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student Verene = new Student(
                1L, 
                "Verene",
                "Verene@amazon.de",
                LocalDate.of(2003, 11, 01)
            );

            Student Ilysa = new Student(
                2L, 
                "Ilysa",
                "ikyneton3@sciencedaily.com",
                LocalDate.of(2002, 03, 01)
            );

            Student Duky = new Student(
                3L, 
                "Duky",
                "dcowhig4@usnews.com",
                LocalDate.of(2004, 07, 10)
            );

            Student Nonna = new Student(
                4L, 
                "Nonna",
                "nlainton5@a8.net",
                LocalDate.of(2003, 07, 18)
            );

            Student Madelon = new Student(
                5L, 
                "Madelon",
                "mwauchope6@phpbb.com",
                LocalDate.of(2002, 03, 01)
            );

            Student Rudie = new Student(
                6L, 
                "Rudie",
                "rmcturlough7@livejournal.com",
                LocalDate.of(2004, 07, 10)
            );

            Student Winslow = new Student(
                7L, 
                "Winslow",
                "wyannoni8@blogspot.com",
                LocalDate.of(2001, 05, 18)
            );

            Student Gridon = new Student(
                8L, 
                "Gridon",
                "lgridon9@wunderground.com",
                LocalDate.of(2003, 06, 18)
            );

            Student Livvyy = new Student(
                9L, 
                "Livvyy",
                "lcuttinga@cyberchimps.com",
                LocalDate.of(2006, 04, 18)
            );

            Student Rosalyn = new Student(
                10L, 
                "Rosalyn",
                "rplanqueb@state.tx.us",
                LocalDate.of(2003, 06, 18)
            );

            Student Haily = new Student(
                11L, 
                "Haily",
                "hellardc@ucla.edu",
                LocalDate.of(2006, 04, 18)
            );

            Student Myrtice = new Student(
                12L, 
                "Myrtice",
                "mkitsd@quantcast.com",
                LocalDate.of(2006, 04, 18)
            );

            Student Ardenia = new Student(
                13L, 
                "Ardenia",
                "abalcone@newyorker.com",
                LocalDate.of(2006, 04, 18)
            );
            repository.saveAll(List.of(Verene, Ilysa, Duky, Nonna, Madelon,    
                                       Rudie, Winslow, Gridon, Livvyy, Rosalyn, Haily,
                                       Myrtice, Ardenia
                                       ));
        };
    }
}
