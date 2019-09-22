package com.dashletter.dashletterbackend.Controllers;


import com.dashletter.dashletterbackend.Models.Newsletter;
import com.dashletter.dashletterbackend.Services.NewsletterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsletterController {

    @Autowired
    private NewsletterServices newsletterServices;

    @RequestMapping("/newsletters") //TO GET NEWSLETTER FROM THE DATABASE.
    public List<Newsletter> getAllNewsletters(){
        return newsletterServices.getAllNewsletters();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/newsletter") //TO STORE NEWSLETTER IN THE DATABASE.
    public void addNewsletters(@RequestBody Newsletter newsletter){
        newsletterServices.addNewsletters(newsletter);
    }

}
