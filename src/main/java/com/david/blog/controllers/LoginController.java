package com.david.blog.controllers;

import com.david.blog.models.Credentials;
import com.david.blog.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {
    private final AuthService authService;
    @PostMapping
    public String login(@RequestBody Credentials credentials){
        return authService.login(credentials);
    }
}
