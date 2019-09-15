package com.dashletter.dashletterbackend.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserNewsletterParagraph {
    @Id
    private long id;
    private String fontSize;
    private String textColor;
    private String fontFamily;
    private String textAlignment;
    private String textStyle;
    @ManyToOne
    private UserNewsletterTitle userNewsletterTitle;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(String textAlignment) {
        this.textAlignment = textAlignment;
    }

    public String getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(String textStyle) {
        this.textStyle = textStyle;
    }
}
