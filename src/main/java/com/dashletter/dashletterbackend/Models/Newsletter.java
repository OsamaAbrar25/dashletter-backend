package com.dashletter.dashletterbackend.Models;

import javax.persistence.Entity;

@Entity
public class Newsletter {

    String title;
    String imgUrl;

    public Newsletter() {
    }

    public Newsletter(String title, String imgUrl) {
        this.title = title;
        this.imgUrl = imgUrl;
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

