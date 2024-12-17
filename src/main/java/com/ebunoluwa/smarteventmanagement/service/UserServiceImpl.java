package com.ebunoluwa.smarteventmanagement.service;

import com.ebunoluwa.smarteventmanagement.dto.UserDto;
import com.ebunoluwa.smarteventmanagement.model.User;
import com.ebunoluwa.smarteventmanagement.repositories.UserRepository;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user = new User();
        return null;
    }
}
