package com.PhotoOne;


import com.PhotoOne.dao.entity.Comment;
import com.PhotoOne.dao.entity.Image;
import com.PhotoOne.dao.entity.User;
import com.PhotoOne.hibernateFactory.Factory;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User");

         User defaultUser = new User();
         System.out.println("Имя пользователя");
         defaultUser.setName(scanner.nextLine());
         System.out.println("Логин");
         defaultUser.setLogin(scanner.nextLine());
         System.out.println("Пароль");
         defaultUser.setPassword(scanner.next());

         try {
         Factory.getInstance().getUserDAO().addUser(defaultUser);
         } catch (SQLException e) {
         e.printStackTrace();
         }


        System.out.println("Comment");

        Comment someComment = new Comment();
        someComment.setCommentText("First comment");
        someComment.setDateComment(new Date());

        try {
            Factory.getInstance().getCommentDAO().addComment(someComment);
        } catch (SQLException e) {
            e.printStackTrace();

        }

        System.out.println("Image");

        Image someImage = new Image();
        someImage.setImageName("image1");
        someImage.setPath("\\Images\\image.jpg");
        someImage.setCurrentDate(new Date());

        try {
            Factory.getInstance().getImageDAO().addImage(someImage);
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

}
