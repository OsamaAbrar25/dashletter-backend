package com.dashletter.dashletterbackend.Authentication;

import com.dashletter.dashletterbackend.Models.MerchantProfileModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationMerchantRepository extends JpaRepository<MerchantProfileModel, Long> {
    MerchantProfileModel findByUsername(String username);
}
