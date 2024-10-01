package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Parrot parrot = context.getBean("mikiBean",  Parrot.class);
        //System.out.println(parrot.getName());

        //var rikiParrot = context.getBean("rikiBean",  Parrot.class);
        //System.out.println(rikiParrot.getName());

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

    }
}