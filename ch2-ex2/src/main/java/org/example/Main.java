package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        String name = context.getBean(String.class);
        System.out.println(name);

        Integer age = context.getBean(Integer.class);
        System.out.println(age);

    }
}