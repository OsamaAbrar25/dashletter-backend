package com.dashletter.dashletterbackend.Controllers;

import com.dashletter.dashletterbackend.Services.UserProfileService;
import com.dashletter.dashletterbackend.Models.UserProfileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserProfileController {

    @Autowired
    private UserProfileService profileServices;

    @RequestMapping("/userProfile")  //RETURN ALL THE DETAILS OF USER PROFILE.
    public List<UserProfileModel> getProfiles(){
        return profileServices.getAllProfiles();
    }

    @RequestMapping("/userProfile/{username}") //RETURN DETAILS OF THOSE USER WHOSE USERNAME MATCHES THE STORED USERNAME.
    public Optional<UserProfileModel> getProfile(@PathVariable String username)
    {
        return profileServices.getProfile(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/userProfile") //STORE THE DETAILS OF NEW USER.
    public void addProfile(@RequestBody UserProfileModel userProfileModel)
    {
        profileServices.addTopic(userProfileModel);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/userProfile/{username}") //MAKE CHANGE IN THE USER PROFILE.
    public void updateProfile(@RequestBody UserProfileModel userProfileModel, @PathVariable String username)
    {
        profileServices.updateProfile(userProfileModel,username);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/userProfile/{username}")//DELETE USER PROFILE FROM DATABASE.
    public void deleteProfile(@RequestBody UserProfileModel userProfileModel, @PathVariable String username)
    {
        profileServices.deleteProfile(userProfileModel,username);
    }
}