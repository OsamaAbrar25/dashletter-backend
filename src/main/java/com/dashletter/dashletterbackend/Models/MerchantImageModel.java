package com.dashletter.dashletterbackend.Models;


import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class MerchantImageModel {

    @Id
    private String imgLocation;
    private float height;
    private float width;

    public MerchantImageModel() {
    }

    public MerchantImageModel(String imgLocation, float height, float width) {
        this.imgLocation = imgLocation;
        this.height = height;
        this.width = width;
    }

    public String getImgLocation() {
        return imgLocation;
    }

    public void setImgLocation(String imgLocation) {
        this.imgLocation = imgLocation;
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
