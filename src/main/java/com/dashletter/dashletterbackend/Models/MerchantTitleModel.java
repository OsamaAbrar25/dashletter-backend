package com.dashletter.dashletterbackend.Models;


import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class MerchantTitleModel {

    @Id
    private String fontSize;
    private String textColor;
    private String fontFamily;
    private String style;
    private String alignment;


    public MerchantTitleModel() {
    }

    public MerchantTitleModel(String fontSize, String textColor, String fontFamily, String style, String alignment) {
        this.fontSize = fontSize;
        this.textColor = textColor;
        this.fontFamily = fontFamily;
        this.style = style;
        this.alignment = alignment;
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
