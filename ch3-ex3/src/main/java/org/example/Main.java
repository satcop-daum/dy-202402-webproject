package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        boolean flagYn = true;

        if (flagYn) {
            Parrot p1 = new Parrot();
            p1.setName("kiki");
            Supplier<Parrot> parrotSupplier = () -> p1;
            context.registerBean("parrot1", Parrot.class, parrotSupplier);
        } else {
            Parrot p1 = new Parrot();
            p1.setName("miki");
            Supplier<Parrot> parrotSupplier = () -> p1;
            context.registerBean("parrot1", Parrot.class, parrotSupplier);
        }

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());





    }
}