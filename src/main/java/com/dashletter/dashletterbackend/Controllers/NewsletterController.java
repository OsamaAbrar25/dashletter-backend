package com.dashletter.dashletterbackend.Controllers;


import com.dashletter.dashletterbackend.Models.Newsletter;
import com.dashletter.dashletterbackend.Services.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsletterController {

    @Autowired
    private NewsletterService newsletterService;

    @RequestMapping("/newsletters") //TO GET NEWSLETTER FROM THE DATABASE.
    public List<Newsletter> getAllNewsletters(){
        return newsletterService.getAllNewsletters();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/newsletters") //TO STORE NEWSLETTER IN THE DATABASE.
    public void addNewsletters(@RequestBody Newsletter newsletter){
        newsletterService.addNewsletters(newsletter);
    }

}
