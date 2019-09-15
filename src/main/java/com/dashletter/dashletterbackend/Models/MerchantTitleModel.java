package com.dashletter.dashletterbackend.Models;


import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class MerchantTitleModel {

    @Id
    private String fontSize;
    private String textColor;
    private String fontFamily;
    private String textStyle;
    private String textAlignment;

    public MerchantTitleModel() {
    }

    public MerchantTitleModel(String fontSize, String textColor, String fontFamily, String textStyle, String textAlignment) {
        this.fontSize = fontSize;
        this.textColor = textColor;
        this.fontFamily = fontFamily;
        this.textStyle = textStyle;
        this.textAlignment = textAlignment;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(String textStyle) {
        this.textStyle = textStyle;
    }

    public String getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(String textAlignment) {
        this.textAlignment = textAlignment;
    }
}
