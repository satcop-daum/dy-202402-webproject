package org.example;



import org.example.comment.CommentService;
import org.example.comment.UserService;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = context.getBean(CommentService.class);
        var us = context.getBean(UserService.class);

        boolean b = cs.getCommentRepository() == us.getCommentRepository();
        System.out.println(b);
    }
}