package com.dashletter.dashletterbackend.Models;


import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class MerchantNewsletterImageModel {

    @Id
    private String imageLocation;
    private float height;
    private float width;

    public MerchantNewsletterImageModel() {
    }

    public MerchantNewsletterImageModel(String imageLocation, float height, float width) {
        this.imageLocation = imageLocation;
        this.height = height;
        this.width = width;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
