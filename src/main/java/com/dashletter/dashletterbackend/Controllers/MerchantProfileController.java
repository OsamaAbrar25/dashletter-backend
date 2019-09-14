package com.dashletter.dashletterbackend.Controllers;


import com.dashletter.dashletterbackend.Models.MerchantProfileModel;
import com.dashletter.dashletterbackend.Services.MerchantProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MerchantProfileController {

    @Autowired
    private MerchantProfileService merchantProfileService;

    @RequestMapping("/merchantProfile") //  GET ALL THE ENTITIES OF ALL MERCHANTS.
    public List<MerchantProfileModel> getAllMerchantProfile()
    {
        return merchantProfileService.getAllMerchantProfile();
    }


    @RequestMapping("/merchantProfile/{username}") //RETURN ENTITY OF THE MERCHANT WHOSE DATA IS STORED IN DATABASE.
    public Optional<MerchantProfileModel> getProfile(@PathVariable String username)
    {
        return merchantProfileService.getMerchantProfile(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/merchantProfile") //ADD NEW MERCHANT TO THE DATABASE.
    public void addMerchantProfile(@RequestBody MerchantProfileModel merchantProfileModel)
    {
        merchantProfileService.addMerchantProfile(merchantProfileModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/merchantProfile/{username}")//UPDATE THE STORED MERCHANT DATA.
    public void updateMerchantProfile(@PathVariable String username,@RequestBody MerchantProfileModel merchantProfileModel)
    {
        merchantProfileService.updateMerchantProfile(username,merchantProfileModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/merchantProfile/{username}")//DELETE THE ENTITY OF MERCHANT WHOSE USERNAME MATCHES.
    public void deleteMerchantProfile(@PathVariable String username,@RequestBody MerchantProfileModel merchantProfileModel)
    {
        merchantProfileService.deleteMerchantProfile(username,merchantProfileModel);
    }
}
