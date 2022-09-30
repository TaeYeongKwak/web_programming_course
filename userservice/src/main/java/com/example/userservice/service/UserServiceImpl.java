package com.example.userservice.service;

import com.example.userservice.dto.UserDto;

import java.util.UUID;

public class UserServiceImpl implements UserService{
    @Override
    public UserDto createUser(UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
