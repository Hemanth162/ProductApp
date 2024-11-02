package com.example.Demo.Service;

import com.example.Demo.Dto.UserDto;
import com.example.Demo.Entity.User;

public interface UserService {
 User findByUsername(String username);

 User save(UserDto userDto);

}