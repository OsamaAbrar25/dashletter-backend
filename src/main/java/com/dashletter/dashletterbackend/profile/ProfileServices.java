package com.dashletter.dashletterbackend.profile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileServices {

    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> getprofiles() {
        List<Profile> profiles = new ArrayList<>();
        profileRepository.findAll()
                .forEach(profiles::add);
        return profiles;
    }

    public Optional<Profile> getProfile(String username) {
        return profileRepository.findById(username);
    }

    public void addTopic(Profile profile) {
        profileRepository.save(profile);
    }

    public void updateProfile(Profile profile, String username) {
        profileRepository.save(profile);

    }

    public void deleteProfile(Profile profile, String username) {
        profileRepository.delete(profile);
    }
}
