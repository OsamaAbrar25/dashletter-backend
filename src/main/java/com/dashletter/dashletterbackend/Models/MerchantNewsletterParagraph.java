package com.dashletter.dashletterbackend.Models;

import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Service
public class MerchantNewsletterParagraph {

    @Id
    private String textStyle;
    private int textSize;
    private String textColor;
    private String fontFamily;
    private String textAlignment;
    @ManyToOne
    private MerchantNewsletterTitle merchantNewsletterTitle;


    public MerchantNewsletterParagraph() {
    }

    public MerchantNewsletterParagraph(String style, int textSize, String textColor, String fontFamily, String alignment, long merchantNewsletterTitleId ) {
        this.textStyle = style;
        this.textSize = textSize;
        this.textColor = textColor;
        this.fontFamily = fontFamily;
        this.textAlignment = alignment;
        this.merchantNewsletterTitle = new MerchantNewsletterTitle(merchantNewsletterTitleId,"","","","","");

    }

    public MerchantNewsletterTitle getMerchantNewsletterTitle() {
        return merchantNewsletterTitle;
    }

    public void setMerchantNewsletterTitle(MerchantNewsletterTitle merchantNewsletterTitle) {
        this.merchantNewsletterTitle = merchantNewsletterTitle;
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
