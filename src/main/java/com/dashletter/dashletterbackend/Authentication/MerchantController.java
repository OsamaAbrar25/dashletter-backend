package com.dashletter.dashletterbackend.Authentication;

import com.dashletter.dashletterbackend.Models.MerchantProfileModel;
import com.dashletter.dashletterbackend.Models.UserProfileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchants")
public class MerchantController {
    @Autowired
    private ApplicationMerchantRepository applicationMerchantRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody MerchantProfileModel user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        applicationMerchantRepository.save(user);
    }
}
