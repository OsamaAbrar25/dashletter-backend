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

    @RequestMapping("merchants/profile") //  GET ALL THE ENTITIES OF ALL MERCHANTS.
    public List<MerchantProfileModel> getAllMerchantProfile()
    {
        return merchantProfileService.getAllMerchantProfile();
    }

    @RequestMapping("merchants/profile/{id}") //RETURN ENTITY OF THE MERCHANT WHOSE DATA IS STORED IN DATABASE.
    public Optional<MerchantProfileModel> getProfile(@PathVariable long id)
    {
        return merchantProfileService.getMerchantProfile(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "merchants/profile") //ADD NEW MERCHANT TO THE DATABASE.
    public void addMerchantProfile(@RequestBody MerchantProfileModel merchantProfileModel)
    {
        merchantProfileService.addMerchantProfile(merchantProfileModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "merchants/profile/{id}")//UPDATE THE STORED MERCHANT DATA.
    public void updateMerchantProfile(@PathVariable long id,@RequestBody MerchantProfileModel merchantProfileModel)
    {
        merchantProfileService.updateMerchantProfile(id, merchantProfileModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "merchants/profile/{id}")//DELETE THE ENTITY OF MERCHANT WHOSE USERNAME MATCHES.
    public void deleteMerchantProfile(@PathVariable long id,@RequestBody MerchantProfileModel merchantProfileModel)
    {
        merchantProfileService.deleteMerchantProfile(id, merchantProfileModel);
    }
}
