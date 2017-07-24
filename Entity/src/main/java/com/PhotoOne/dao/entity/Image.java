package com.PhotoOne.dao.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "image")

public class Image  {
        private int idImage;
        private String imageName;
        private String path;
        private Date currentDate;

              public Image() {
            path = null;
        }

        public Image(String imageName, String path, Date date) {
            super();
            this.imageName = imageName;
            this.path = path;
            this.currentDate = date;
        }

        @Id
        @GeneratedValue(generator = "increment")
        @GenericGenerator(name = "increment", strategy = "increment")
        @Column(name = "idImage")

        public int getId() {
            return idImage;
        }

        public void setId(int idImage) {
            this.idImage = idImage;
        }

        @Column (name = "imageName")
        public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        @Column (name = "filePath")
        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Column(name = "currentDate")
        public Date getCurrentDate() {
            return currentDate;
        }

        public void setCurrentDate(Date currentDate) {
            this.currentDate = currentDate;
        }

        @Override
        public String toString() {
            return currentDate + " " + imageName + " " + path;
        }
    }

