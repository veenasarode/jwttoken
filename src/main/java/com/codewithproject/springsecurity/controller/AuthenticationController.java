package com.codewithproject.springsecurity.controller;


import com.codewithproject.springsecurity.dto.JwtAuthenticationResponse;
import com.codewithproject.springsecurity.dto.RefreshTokenRequest;
import com.codewithproject.springsecurity.dto.SignUpRequest;
import com.codewithproject.springsecurity.dto.SigninRequest;
import com.codewithproject.springsecurity.entities.User;
import com.codewithproject.springsecurity.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest signinRequest)
    {
        return ResponseEntity.ok(authenticationService.sigin(signinRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest)
    {
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}


