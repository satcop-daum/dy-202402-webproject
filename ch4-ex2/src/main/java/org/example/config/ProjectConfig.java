package org.example.config;


import org.example.beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "org.example")
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


}
