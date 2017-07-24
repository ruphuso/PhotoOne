package com.PhotoOne.dao.implementations;

import com.PhotoOne.dao.entity.Comment;
import com.PhotoOne.dao.interfaces.CommentDAO;
import com.PhotoOne.hibernateFactory.HibernateSessionFactory;
import org.hibernate.Session;

import java.sql.SQLException;

public class CommentDAOImpl implements CommentDAO {


    @Override
    public void addComment(Comment comment) throws SQLException {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(comment);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateComment(Comment comment) throws SQLException {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession();) {
            session.beginTransaction();
            session.update(comment);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteComment(Comment comment) throws SQLException {

        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete((comment));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}