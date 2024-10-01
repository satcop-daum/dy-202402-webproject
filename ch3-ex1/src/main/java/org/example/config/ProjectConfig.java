package org.example.config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("koko");
        return parrot;
    }

    @Bean
    //@Bean(name="mikiBean")
    Parrot parrot2() {
        var parrot = new Parrot();
        parrot.setName("miki");
        return parrot;
    }

    @Primary
    //@Bean("rikiBean")
    @Bean
    Parrot parrot3() {
        var parrot = new Parrot();
        parrot.setName("riki");
        return parrot;
    }

}
