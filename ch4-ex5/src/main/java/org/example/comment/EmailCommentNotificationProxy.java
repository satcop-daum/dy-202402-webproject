package org.example.comment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Qualifier("email")
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email notification for comment:" + comment.getText());
    }


}
