package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    private String name;

    public Parrot() {
        System.out.println("Parrot이 생성됨.");
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
