package com.PhotoOne;


import com.PhotoOne.dao.entity.User;
import com.PhotoOne.hibernateFactory.Factory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "MainServlet")
public class MainServlet  extends HttpServlet {


    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
            process(req, response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            process(request, response);
        }

        private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String  name = request.getParameter("name");
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            User user = new User();
            user.setName(name);
            user.setLogin(login);
            user.setPassword(password);
            try {
                Factory.getInstance().getUserDAO().addUser(user);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                Factory.getInstance().getUserDAO().getUserByName(name);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(user.toString());

            response.getWriter().println("<!DOCTYPE HTML>");
            response.getWriter().println("<html><body><p>" + "User ID " +user.getIdUser() +" User Name "+ user.getName() + " UserLogin " + user.getLogin() + "</p></body></html>");

            System.out.println("name: " + name + "; login: " + login + "; password: " + password);

        }


    }

