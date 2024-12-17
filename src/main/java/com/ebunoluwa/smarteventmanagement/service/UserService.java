package com.ebunoluwa.smarteventmanagement.service;

import com.ebunoluwa.smarteventmanagement.dto.UserDto;
import com.ebunoluwa.smarteventmanagement.model.User;

public interface UserService {

    User save (UserDto userDto);

}
