package com.PhotoOne.dao.implementations;

import com.PhotoOne.dao.entity.Image;
import com.PhotoOne.dao.interfaces.ImageDAO;
import com.PhotoOne.hibernateFactory.HibernateSessionFactory;
import org.hibernate.Session;

import java.sql.SQLException;

public class ImageDAOImpl<T extends Image> implements ImageDAO<T> {

    @Override
    public void addImage(T image) throws SQLException {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save((image));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteImage(T image) throws SQLException {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete((image));
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void updateImage(T image) throws SQLException {
        try(Session session = HibernateSessionFactory.getSessionFactory().openSession()){
            session.beginTransaction();
            session.update((image));
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}