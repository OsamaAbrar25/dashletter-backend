package com.dashletter.dashletterbackend.Authentication;

import com.dashletter.dashletterbackend.Models.UserProfileModel;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private ApplicationUserRepository applicationUserRepository;
    public UserDetailsServiceImpl(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserProfileModel userProfileModel = applicationUserRepository.findByUsername(username);
        if (userProfileModel == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(userProfileModel.getUsername(), userProfileModel.getPassword(), emptyList());
    }
}