package com.dashletter.dashletterbackend.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserNewsletter {
    @Id
    private long id;
    private String date;
    private String time;
    private long templateId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }
}
