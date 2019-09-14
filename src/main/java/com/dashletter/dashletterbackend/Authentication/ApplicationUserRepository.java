package com.dashletter.dashletterbackend.Authentication;

import com.dashletter.dashletterbackend.Models.UserProfileModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<UserProfileModel, Long> {

    UserProfileModel findByUsername(String username);

}