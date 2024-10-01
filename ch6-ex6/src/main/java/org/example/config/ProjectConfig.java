package org.example.config;


import org.example.aop.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.example"})
@Configuration
public class ProjectConfig {


    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }


}
