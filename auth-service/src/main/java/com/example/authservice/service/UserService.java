package com.example.authservice.service;

import com.example.authservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.example.authservice.model.User;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
