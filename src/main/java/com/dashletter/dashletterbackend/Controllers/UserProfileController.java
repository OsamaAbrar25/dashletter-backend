package com.dashletter.dashletterbackend.Controllers;

import com.dashletter.dashletterbackend.Models.UserProfileModel;
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
    public List<UserProfileModel> getProfiles(){
        return profileServices.getAllProfiles();
    }

    @RequestMapping("users/profile/{id}") //RETURN DETAILS OF THOSE USER WHOSE USERNAME MATCHES THE STORED USERNAME.
    public Optional<UserProfileModel> getProfile(@PathVariable long id)
    {
        return profileServices.getProfile(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "users/profile") //STORE THE DETAILS OF NEW USER.
    public void addProfile(@RequestBody UserProfileModel userProfileModel)
    {
        profileServices.addTopic(userProfileModel);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "users/profile/{id}") //MAKE CHANGE IN THE USER PROFILE.
    public void updateProfile(@RequestBody UserProfileModel userProfileModel, @PathVariable Long id)
    {
        profileServices.updateProfile(userProfileModel, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "users/profile/{id}")//DELETE USER PROFILE FROM DATABASE.
    public void deleteProfile(@RequestBody UserProfileModel userProfileModel, @PathVariable Long id)
    {
        profileServices.deleteProfile(userProfileModel, id);
    }
}
