package com.dashletter.dashletterbackend.Controllers;

import com.dashletter.dashletterbackend.Services.UserProfileServices;
import com.dashletter.dashletterbackend.Entities.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserProfileController {

    @Autowired
    private UserProfileServices profileServices;

    @RequestMapping("/profile")  //RETURN ALL THE DETAILS OF USER PROFILE.
    public List<UserProfile> getProfiles(){
        return profileServices.getAllProfiles();
    }

    @RequestMapping("/profile/{username}") //RETURN DETAILS OF THOSE USER WHOSE USERNAME MATCHES THE STORED USERNAME.
    public Optional<UserProfile> getProfile(@PathVariable String username)
    {
        return profileServices.getProfile(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/profile") //STORE THE DETAILS OF NEW USER.
    public void addProfile(@RequestBody UserProfile userProfile)
    {
        profileServices.addTopic(userProfile);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/profile/{username}") //MAKE CHANGE IN THE USER PROFILE.
    public void updateProfile(@RequestBody UserProfile userProfile, @PathVariable String username)
    {
        profileServices.updateProfile(userProfile,username);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/profile/{username}")//DELETE USER PROFILE FROM DATABASE.
    public void deleteProfile(@RequestBody UserProfile userProfile, @PathVariable String username)
    {
        profileServices.deleteProfile(userProfile,username);
    }
}
