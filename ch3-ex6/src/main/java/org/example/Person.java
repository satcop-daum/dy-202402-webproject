package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    private String name;

    @Autowired
    private Parrot parrot;

    public Person() {
        System.out.println("Person 이 생성됨.");
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

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @PostConstruct
    public void init() {
        System.out.println("Person init()가 호출됨.");
        this.name = "Ella";
    }

}
