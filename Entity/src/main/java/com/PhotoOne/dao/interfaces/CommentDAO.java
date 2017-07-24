package com.PhotoOne.dao.interfaces;

import com.PhotoOne.dao.entity.Comment;

import java.sql.SQLException;

public interface CommentDAO {
    public void addComment(Comment comment) throws SQLException;
    public void updateComment(Comment comment) throws SQLException;
    public void deleteComment(Comment comment) throws SQLException;
}
