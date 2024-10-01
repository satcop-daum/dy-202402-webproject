package org.example;


import org.example.comment.Comment;
import org.example.comment.CommentService;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("홍길동");
        comment.setText(" 안녕하세요. 코멘트 내용입니다. ");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);



    }
}