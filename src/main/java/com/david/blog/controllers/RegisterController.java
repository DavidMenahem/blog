package com.david.blog.controllers;

import com.david.blog.dto.UserDto;
import com.david.blog.models.UserEntity;
import com.david.blog.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {
private final UserService userService;

    @PostMapping
    public UserEntity create(@RequestBody UserDto userDto){
    return userService.create(UserEntity.builder()
            .firstName(userDto.getFirstName())
            .lastName(userDto.getLastName())
            .username(userDto.getUsername())
            .password(userDto.getPassword().hashCode())
            .build());
    }
}
