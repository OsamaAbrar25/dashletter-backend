package com.dashletter.dashletterbackend.Models;


import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Date;

@Service
public class MerchantNewsletterTemplate {

    @Id
    private int templateId;
    private Date date;
    private Date time;

    public MerchantNewsletterTemplate() {
    }

    public MerchantNewsletterTemplate(int templateId, Date date, Date time) {
        this.templateId = templateId;
        this.date = date;
        this.time = time;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}