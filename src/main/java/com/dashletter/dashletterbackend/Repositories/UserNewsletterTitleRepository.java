package com.dashletter.dashletterbackend.Repositories;

import com.dashletter.dashletterbackend.Models.UserNewsletterTitle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserNewsletterTitleRepository extends CrudRepository<UserNewsletterTitle, Long> {
    public List<UserNewsletterTitle> findUserNewsletterTitleModelByUserNewsletterModelId(long id);
}
