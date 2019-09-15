package com.dashletter.dashletterbackend.Services;


import com.dashletter.dashletterbackend.Models.UserProfile;
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

    public List<UserProfile> getAllProfiles()
    {
        List<UserProfile> userProfiles = new ArrayList<>();
        profileRepository.findAll()
                .forEach(userProfiles::add);
        return userProfiles;
    }

    public Optional<UserProfile> getProfile(long id)
    {
        return profileRepository.findById(id);
    }

    public void addProfile(UserProfile userProfile)
    {
        profileRepository.save(userProfile);
    }

    public UserProfile updateProfile(UserProfile userProfile, long id)
    {
        profileRepository.save(userProfile);
        return profileRepository.save(userProfile);
    }
    public void deleteProfile(long id)
    {
        profileRepository.deleteById(id);
    }
}
