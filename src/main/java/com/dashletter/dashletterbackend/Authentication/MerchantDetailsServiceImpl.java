package com.dashletter.dashletterbackend.Authentication;

import com.dashletter.dashletterbackend.Models.MerchantProfileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class MerchantDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private ApplicationMerchantRepository applicationMerchantRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MerchantProfileModel merchantProfileModel = applicationMerchantRepository.findByUsername(username);
        if (merchantProfileModel == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(merchantProfileModel.getUsername(), merchantProfileModel.getPassword(), emptyList());
    }
}
