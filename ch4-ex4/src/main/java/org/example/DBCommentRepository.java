package org.example;

public class DBCommentRepository implements CommentRepository {


    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
