package com.dashletter.dashletterbackend.Controllers;

import com.dashletter.dashletterbackend.Models.UserProfile;
import com.dashletter.dashletterbackend.Services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserProfileController {

    @Autowired
    private UserProfileService profileServices;

    @RequestMapping("users/profile")  //RETURN ALL THE DETAILS OF USER PROFILE.
    public List<UserProfile> getProfiles(){
        return profileServices.getAllProfiles();
    }

    @RequestMapping("users/profile/{id}") //RETURN DETAILS OF THOSE USER WHOSE USERNAME MATCHES THE STORED USERNAME.
    public Optional<UserProfile> getProfile(@PathVariable long id)
    {
        return profileServices.getProfile(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "users/profile") //STORE THE DETAILS OF NEW USER.
    public void addProfile(@RequestBody UserProfile userProfile)
    {
        profileServices.addProfile(userProfile);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "users/profile/{id}") //MAKE CHANGE IN THE USER PROFILE.
    public UserProfile updateProfile(@RequestBody UserProfile userProfile, @PathVariable Long id)
    {
        return profileServices.updateProfile(userProfile, id);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "users/profile/{id}")//DELETE USER PROFILE FROM DATABASE.
    public void deleteProfile(@PathVariable Long id)
    {
        profileServices.deleteProfile(id);

    }
}
