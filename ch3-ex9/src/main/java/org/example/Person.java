package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    private String name;
    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        System.out.println("Person 이 생성됨.");
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    /*
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
    */

    @PostConstruct
    public void init() {
        System.out.println("Person init()가 호출됨.");
        this.name = "Ella";
    }

}
