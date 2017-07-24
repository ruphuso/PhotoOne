package com.PhotoOne.dao.interfaces;

import com.PhotoOne.dao.entity.Image;

import java.sql.SQLException;

public interface ImageDAO <T extends Image> {
    public void addImage(T image) throws SQLException;
    public void deleteImage(T image) throws SQLException;
    public void updateImage(T image) throws SQLException;

}
