package com.sherwin.dev.hotelmanagement.service;

import com.sherwin.dev.hotelmanagement.dto.AuthenticationRequest;
import com.sherwin.dev.hotelmanagement.dto.AuthenticationResponse;
import com.sherwin.dev.hotelmanagement.dto.RegisterRequest;

public interface AuthService {
    AuthenticationResponse register(RegisterRequest registerRequest);
    AuthenticationResponse authenticate(AuthenticationRequest request);
}
