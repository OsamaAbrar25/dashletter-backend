package com.dashletter.dashletterbackend.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Newsletter {

    @Id
    private long id;
    private String title;
    private String imgUrl;


    public Newsletter() {
    }

    public Newsletter(long id, String title, String imgUrl) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

