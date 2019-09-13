package com.dashletter.dashletterbackend.Services;


import com.dashletter.dashletterbackend.Repositories.UserProfileRepository;
import com.dashletter.dashletterbackend.Entities.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserProfileServices {

    @Autowired
    private UserProfileRepository profileRepository;

    public List<UserProfile> getAllProfiles()
    {
        List<UserProfile> userProfiles = new ArrayList<>();
        profileRepository.findAll()
                .forEach(userProfiles::add);
        return userProfiles;
    }

    public Optional<UserProfile> getProfile(String username)
    {
        return profileRepository.findById(username);
    }

    public void addTopic(UserProfile userProfile)
    {
        profileRepository.save(userProfile);
    }

    public void updateProfile(UserProfile userProfile, String username)
    {
        profileRepository.save(userProfile);

    }

    public void deleteProfile(UserProfile userProfile, String username)
    {
        profileRepository.delete(userProfile);

    }
}
