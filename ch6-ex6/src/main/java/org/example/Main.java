package org.example;


import org.example.config.ProjectConfig;

import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("코멘트 작성 내용");
        comment.setAuthor("홍길동");

        String result = commentService.publishComment(comment);
        System.out.println("result:" + result);

        String result2 = commentService.deleteComment(comment);
        String result3 = commentService.editComment(comment);


        //commentService.displayComment(comment);



    }
}