package com.dashletter.dashletterbackend.Models;

import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class ParagraphModel {

    @Id
    private String style;
    private int textSize;
    private String textColor;
    private String fontFamily;
    private String alignment;


    public ParagraphModel() {
    }

    public ParagraphModel(String style, int textSize, String textColor, String fontFamily, String alignment) {
        this.style = style;
        this.textSize = textSize;
        this.textColor = textColor;
        this.fontFamily = fontFamily;
        this.alignment = alignment;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
