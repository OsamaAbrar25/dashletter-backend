package com.dashletter.dashletterbackend.Repositories;

import com.dashletter.dashletterbackend.Models.UserProfileModel;
import org.springframework.data.repository.CrudRepository;

public interface UserProfileRepository extends CrudRepository<UserProfileModel, String> {
}
