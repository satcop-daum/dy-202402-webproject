package org.example;

public class Main {
    public static void main(String[] args) {

        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("홍길동");
        comment.setText("댓글 입니다.");

        commentService.publishComment(comment);
    }
}


/*
    댓글 서비스(댓글 작성, 보고, 지우고.....)
    코멘트
    - 모델(Comment)
    - 서비스(코멘트서비스)
    - DB저장하는 부분(레파지토리)
    - 프락시서비스
 */