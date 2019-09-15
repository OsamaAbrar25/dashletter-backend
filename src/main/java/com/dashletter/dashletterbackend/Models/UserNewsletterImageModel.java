package com.dashletter.dashletterbackend.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserNewsletterImageModel {
    @Id
    private long id;
    private String height;
    private String width;
    private String imageLocation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
}
