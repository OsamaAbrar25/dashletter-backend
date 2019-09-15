package com.dashletter.dashletterbackend.Services;


import com.dashletter.dashletterbackend.Repositories.MerchantNewsletterTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantNewsletterTitleService {

    @Autowired
    private MerchantNewsletterTitleRepository merchantNewsletterTitleRepository;

    public void addTitle(long titleId, long paragraphId) {
        merchantNewsletterTitleRepository.saveByMerchantNewsletterTitleId(titleId);
        return;
    }
}
