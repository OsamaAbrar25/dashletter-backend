package com.dashletter.dashletterbackend.profile;


import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfileController {

    @Autowired
    private ProfileServices profileServices;

    @RequestMapping("/profile")
    public List<Profile> getprofiles(){
        return profileServices.getprofiles();
    }

    @RequestMapping("/profile/{username}")
    public Optional<Profile> getProfile(@PathVariable String username){
        return profileServices.getProfile(username);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/profile")
    public void addProfile(@RequestBody Profile profile){
        profileServices.addTopic(profile);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/profile/{username}")
    public void updateProfile(@RequestBody Profile profile, @PathVariable String username){
        profileServices.updateProfile(profile,username);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/profile/{username}")
    public void deleteProfile(@RequestBody Profile profile, @PathVariable String username){
        profileServices.deleteProfile(profile,username);
    }
}
