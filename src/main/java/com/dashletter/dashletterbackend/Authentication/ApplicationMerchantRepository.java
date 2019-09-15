package com.dashletter.dashletterbackend.Authentication;

import com.dashletter.dashletterbackend.Models.MerchantProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationMerchantRepository extends JpaRepository<MerchantProfile, Long> {
    MerchantProfile findByUsername(String username);
}
