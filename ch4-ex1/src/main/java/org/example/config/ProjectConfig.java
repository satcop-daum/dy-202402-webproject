package org.example.config;

import org.example.Parrot;
import org.example.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        var parrot = new Parrot();
        parrot.setName("koko");
        return parrot;
    }


    @Bean
    public Parrot parrot2() {
        var parrot = new Parrot();
        parrot.setName("miki");
        return parrot;
    }

    @Bean
    public Person person(@Qualifier("parrot1") Parrot parrot1) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot1);
        return person;
    }



}
