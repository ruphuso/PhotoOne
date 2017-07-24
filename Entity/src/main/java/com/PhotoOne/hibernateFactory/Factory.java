package com.PhotoOne.hibernateFactory;

import com.PhotoOne.dao.implementations.CommentDAOImpl;
import com.PhotoOne.dao.implementations.ImageDAOImpl;
import com.PhotoOne.dao.implementations.UserDAOImpl;
import com.PhotoOne.dao.interfaces.CommentDAO;
import com.PhotoOne.dao.interfaces.ImageDAO;
import com.PhotoOne.dao.interfaces.UserDAO;

public class Factory {

    private static UserDAO userDAO = null;
    private static ImageDAO imageDAO = null;
    private static CommentDAO commentDAO = null;

    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }
    public ImageDAO getImageDAO() {
        if (imageDAO == null) {
            imageDAO = new ImageDAOImpl();
        }
        return imageDAO;
    }

    public CommentDAO getCommentDAO() {
        if (commentDAO == null) {
            commentDAO = new CommentDAOImpl();
        }
        return commentDAO;
    }


}