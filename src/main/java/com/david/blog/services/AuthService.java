package com.david.blog.services;

import com.david.blog.models.Credentials;
import com.david.blog.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthenticationManager authenticationManager;

    public String  login(final Credentials credentials) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(credentials.getUsername(), credentials.getPassword().hashCode())
            );
        } catch (final BadCredentialsException e) {
            throw new RuntimeException("Incorrect credentials");
        }

        return JwtUtil.generateToken(credentials.getUsername());
    }
}

