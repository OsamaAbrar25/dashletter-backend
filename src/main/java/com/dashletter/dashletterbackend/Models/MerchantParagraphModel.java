package com.dashletter.dashletterbackend.Models;

import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class MerchantParagraphModel {

    @Id
    private String textStyle;
    private int textSize;
    private String textColor;
    private String fontFamily;
    private String textAlignment;


    public MerchantParagraphModel() {
    }

    public MerchantParagraphModel(String style, int textSize, String textColor, String fontFamily, String alignment) {
        this.textStyle = style;
        this.textSize = textSize;
        this.textColor = textColor;
        this.fontFamily = fontFamily;
        this.textAlignment = alignment;
    }

    public String getStyle() {
        return textStyle;
    }

    public void setStyle(String style) {
        this.textStyle = style;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
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

    public String getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(String textAlignment) {
        this.textAlignment = textAlignment;
    }
}
