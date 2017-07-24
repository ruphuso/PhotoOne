package com.PhotoOne.dao.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


    @Entity
    @Table(name = "comment")

    public class Comment {
        private int idComment;
        private Date dateComment;
        private String commentText;
        //private User user;

        @Id
        @GeneratedValue(generator = "increment")
        @GenericGenerator(name = "increment", strategy = "increment")
        @Column(name = "idComment")
        public int getIdComment() {
            return idComment;
        }

        public void setIdComment(int idComment) {
            this.idComment = idComment;
        }

        @Column(name = "commentDate")
        public Date getDateComment() {
            return dateComment;
        }

        public void setDateComment(Date dateComment) {
            this.dateComment = dateComment;
        }

        @Column(name = "commentText")
        public String getCommentText() {
            return commentText;
        }

        public void setCommentText(String commentText) {
            this.commentText = commentText;
        }

        @Override
        public String toString() {
            return "Comment{" +
                    "idComment=" + idComment +
                    ", dateComment=" + dateComment +
                    ", commentText='" + commentText + '\'' +
                    ", user=" +
                    '}';


        }

}
