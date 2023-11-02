package com.codewithproject.springsecurity.services;

import com.codewithproject.springsecurity.dto.JwtAuthenticationResponse;
import com.codewithproject.springsecurity.dto.RefreshTokenRequest;
import com.codewithproject.springsecurity.dto.SignUpRequest;
import com.codewithproject.springsecurity.dto.SigninRequest;
import com.codewithproject.springsecurity.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse sigin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
