package com.david.blog.services;

import com.david.blog.models.UserEntity;
import com.david.blog.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public UserEntity getOne(String username){
        return userRepository.findByUsername(username);
    }

    public UserEntity create(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
}
