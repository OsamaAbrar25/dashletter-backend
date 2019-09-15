package com.dashletter.dashletterbackend.Services;

import com.dashletter.dashletterbackend.Models.UserNewsletterTitle;
import com.dashletter.dashletterbackend.Repositories.UserNewsletterTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserNewsletterTitleService {
    @Autowired
    private UserNewsletterTitleRepository userNewsletterTitleRepository;

    public List<UserNewsletterTitle> getAllTitles(long newsletterId){
        List<UserNewsletterTitle> titles = new ArrayList<>();
        userNewsletterTitleRepository.findUserNewsletterTitleModelByUserNewsletterModelId(newsletterId)
                .forEach(titles::add);
        return titles;
    }
}
