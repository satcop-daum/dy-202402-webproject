package org.example.service;

import org.example.Comment;
import org.example.aop.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {

        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
        return "SUCCESS";
    }

    public String editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
        return "SUCCESS";
    }

}
