package com.dashletter.dashletterbackend.Repositories;

import com.dashletter.dashletterbackend.Models.MerchantNewsletterTitle;
import com.dashletter.dashletterbackend.Models.MerchantProfile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MerchantNewsletterTitleRepository extends CrudRepository<MerchantNewsletterTitle, String> {

    public MerchantProfile saveByMerchantNewsletterTitleId(long id);
}
