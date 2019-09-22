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

    @RequestMapping("/user/newsletters")
    public List<Newsletter> getAllNewsletters(){
        return newsletterServices.getAllNewsletters();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/newsletter")
    public void addNewsletters(@RequestBody Newsletter newsletter){
        newsletterServices.addNewsletters(newsletter);
    }

}
