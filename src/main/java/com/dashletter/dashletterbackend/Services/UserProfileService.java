package com.dashletter.dashletterbackend.Services;


import com.dashletter.dashletterbackend.Models.UserProfileModel;
import com.dashletter.dashletterbackend.Repositories.UserProfileRepository;
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

    public Optional<UserProfileModel> getProfile(long id)
    {
        return profileRepository.findById(id);
    }

    public void addTopic(UserProfileModel userProfileModel)
    {
        profileRepository.save(userProfileModel);
    }

    public void updateProfile(UserProfileModel userProfileModel, long id)
    {
        profileRepository.save(userProfileModel);

    }
    public void deleteProfile(long id)
    {
        profileRepository.deleteById(id);

    }
}
