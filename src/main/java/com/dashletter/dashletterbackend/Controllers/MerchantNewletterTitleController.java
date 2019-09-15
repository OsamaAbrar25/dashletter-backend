package com.dashletter.dashletterbackend.Controllers;


import com.dashletter.dashletterbackend.Services.MerchantNewsletterTitleService;
import com.dashletter.dashletterbackend.Services.UserNewsletterTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantNewletterTitleController {

    @Autowired
    private MerchantNewsletterTitleService merchantNewsletterTitleService;

    @Autowired
    private UserNewsletterTitleService userNewsletterTitleService;

    @RequestMapping(method = RequestMethod.POST,value = "/template/{titleId}/title/{paragraphId}")
    public void addTitle(@PathVariable long titleId, @PathVariable long paragraphId){
        merchantNewsletterTitleService.addTitle(titleId,paragraphId);
        userNewsletterTitleService.addTitle(titleId,paragraphId);
    }
}
