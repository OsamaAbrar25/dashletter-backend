package com.dashletter.dashletterbackend.Repositories;

import com.dashletter.dashletterbackend.Entities.UserProfile;
import org.springframework.data.repository.CrudRepository;

public interface UserProfileRepository extends CrudRepository<UserProfile, String> {
}
