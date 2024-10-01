package org.example.config;

import org.example.Parrot;
import org.example.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConfig {


    @Bean
    Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("koko");
        return parrot;
    }

    @Bean
    Person person(Parrot parrot) {
        var person = new Person();
        person.setName("Ella");
        person.setParrot(parrot);
        return person;
    }

}
