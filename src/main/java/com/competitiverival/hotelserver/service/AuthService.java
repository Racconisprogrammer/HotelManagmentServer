package com.competitiverival.hotelserver.service;

import com.competitiverival.hotelserver.dto.SignupRequest;
import com.competitiverival.hotelserver.dto.UserDto;

import java.util.Optional;

public interface AuthService {

    void createAnAdminAccount();

    UserDto createUser(SignupRequest signupRequest);
}
