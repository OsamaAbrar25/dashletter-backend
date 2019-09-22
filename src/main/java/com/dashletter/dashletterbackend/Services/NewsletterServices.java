package com.dashletter.dashletterbackend.Services;

import com.dashletter.dashletterbackend.Models.Newsletter;
import com.dashletter.dashletterbackend.Repositories.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsletterServices {

    @Autowired
    private NewsletterRepository newsletterRepository;


    public List<Newsletter> getAllNewsletters() {
        List<Newsletter> newsletters = new ArrayList<>();
        newsletterRepository.findAll().forEach(newsletters::add) ;
        return newsletters;
    }

    public void addNewsletters(Newsletter newsletter) {
        newsletterRepository.save(newsletter);
        return;
    }
}
