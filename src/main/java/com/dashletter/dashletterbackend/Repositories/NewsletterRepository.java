package com.dashletter.dashletterbackend.Repositories;

import com.dashletter.dashletterbackend.Models.Newsletter;
import org.springframework.data.repository.CrudRepository;

public interface NewsletterRepository extends CrudRepository<Newsletter,String> {
}
