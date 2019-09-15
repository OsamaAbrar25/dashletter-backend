package com.dashletter.dashletterbackend.Services;


import com.dashletter.dashletterbackend.Models.MerchantProfile;
import com.dashletter.dashletterbackend.Repositories.MerchantProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MerchantProfileService {

    @Autowired
    private MerchantProfileRepository merchantProfileRepository;

    public List<MerchantProfile> getAllMerchantProfile() {
        List<MerchantProfile> merchantProfiles = new ArrayList<>();
        merchantProfileRepository.findAll().forEach(merchantProfiles::add);
        return merchantProfiles;
    }

    public Optional<MerchantProfile> getMerchantProfile(long id) {
        return merchantProfileRepository.findById(id);
    }

    public void addMerchantProfile(MerchantProfile merchantProfile) {
        merchantProfileRepository.save(merchantProfile);
    }

    public void updateMerchantProfile(long id, MerchantProfile merchantProfile) {
        merchantProfileRepository.save(merchantProfile);
    }


    public void deleteMerchantProfile(long id)
    {
        merchantProfileRepository.deleteById(id);
    }
}
