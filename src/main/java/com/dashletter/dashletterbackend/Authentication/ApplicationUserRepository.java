package com.dashletter.dashletterbackend.Authentication;

import com.dashletter.dashletterbackend.Models.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<UserProfile, Long> {

    UserProfile findByUsername(String username);

}