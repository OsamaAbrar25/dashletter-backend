package com.dashletter.dashletterbackend.Controllers;

import com.dashletter.dashletterbackend.Models.UserNewsletterTitle;
import com.dashletter.dashletterbackend.Services.UserNewsletterTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserNewsletterTitleController {
    @Autowired
    private UserNewsletterTitleService userNewsletterTitleService;

    @RequestMapping("/newsletters/{newsletterId}/titles")
    public List<UserNewsletterTitle> getAllTitles(@PathVariable long newsletterId){
        return userNewsletterTitleService.getAllTitles(newsletterId);
    }
}
