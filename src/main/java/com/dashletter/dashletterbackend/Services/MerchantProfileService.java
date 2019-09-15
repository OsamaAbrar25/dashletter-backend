package com.dashletter.dashletterbackend.Services;


import com.dashletter.dashletterbackend.Models.MerchantProfileModel;
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

    public List<MerchantProfileModel> getAllMerchantProfile() {
        List<MerchantProfileModel> merchantProfiles = new ArrayList<>();
        merchantProfileRepository.findAll().forEach(merchantProfiles::add);
        return merchantProfiles;
    }

    public Optional<MerchantProfileModel> getMerchantProfile(long id) {
        return merchantProfileRepository.findById(id);
    }

    public void addMerchantProfile(MerchantProfileModel merchantProfileModel) {
        merchantProfileRepository.save(merchantProfileModel);
    }

    public void updateMerchantProfile(long id, MerchantProfileModel merchantProfileModel) {
        merchantProfileRepository.save(merchantProfileModel);
    }


    public void deleteMerchantProfile(long id, MerchantProfileModel merchantProfileModel) {
        merchantProfileRepository.delete(merchantProfileModel);
    }
}
