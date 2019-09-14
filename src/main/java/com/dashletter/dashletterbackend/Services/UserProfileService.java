package com.dashletter.dashletterbackend.Services;


import com.dashletter.dashletterbackend.Repositories.UserProfileRepository;
import com.dashletter.dashletterbackend.Models.UserProfileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository profileRepository;

    public List<UserProfileModel> getAllProfiles()
    {
        List<UserProfileModel> userProfileModels = new ArrayList<>();
        profileRepository.findAll()
                .forEach(userProfileModels::add);
        return userProfileModels;
    }

    public Optional<UserProfileModel> getProfile(String username)
    {
        return profileRepository.findById(username);
    }

    public void addTopic(UserProfileModel userProfileModel)
    {
        profileRepository.save(userProfileModel);
    }

    public void updateProfile(UserProfileModel userProfileModel, String username)
    {
        profileRepository.save(userProfileModel);

    }

    public void deleteProfile(UserProfileModel userProfileModel, String username)
    {
        profileRepository.delete(userProfileModel);

    }
}
