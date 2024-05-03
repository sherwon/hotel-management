package com.sherwin.dev.hotelmanagement.service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.function.Function;

public interface JwtService {
    String generateToken(UserDetails user);
    String extractUsername(String token);
    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);
    boolean isTokenValid(String token, UserDetails userDetails);
}
