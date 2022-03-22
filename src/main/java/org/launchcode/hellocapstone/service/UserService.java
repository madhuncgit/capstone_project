package org.launchcode.hellocapstone.service;

import org.launchcode.hellocapstone.model.User;
import org.launchcode.hellocapstone.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);

}