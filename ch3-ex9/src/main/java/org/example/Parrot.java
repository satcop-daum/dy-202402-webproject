package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    private String name;
    private final Person person;

    @Autowired
    public Parrot(Person person) {
        System.out.println("Parrot이 생성됨.");
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot [name=" + name + "]";
    }

    @PostConstruct
    public void init() {
        System.out.println("Parrot init() 함수가 호출됨.");
        this.name = "kiki";
    }

}
