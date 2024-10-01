package org.example.comment;

public interface CommentRepository {

    /**
     * Comment 내용을 저장
     */
    void storeComment(Comment comment);

}
