package com.ecoprojects.services.loginServices;

import com.ecoprojects.dtos.loginDto.LoginRequestDto;
import com.ecoprojects.dtos.loginDto.LoginResponseDto;

public interface LoginService {
    LoginResponseDto authenticate(LoginRequestDto dto);

}
