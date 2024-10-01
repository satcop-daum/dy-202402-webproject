package org.example;


import org.example.comment.UserService;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        System.out.println("UserService 빈 생성 전!!!");
        var userService = context.getBean(UserService.class);
        System.out.println("UserService 빈 생성 후!!!");


    }
}