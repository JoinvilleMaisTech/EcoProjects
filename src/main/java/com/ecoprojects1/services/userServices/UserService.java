package com.ecoprojects.services.userServices;

import com.ecoprojects.dtos.usersDto.UserRequestDto;
import com.ecoprojects.dtos.usersDto.UserResponseDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserResponseDto> findAll();
    UserResponseDto findById(Long id);
    UserResponseDto create(UserRequestDto dto);
    UserResponseDto update(Long id, UserRequestDto dto);
    void delete(Long id);
}