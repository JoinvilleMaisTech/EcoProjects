package com.ecoprojects.services.oganizationServices;

import com.ecoprojects.dtos.organizationsDto.OrganizationRequestDto;
import com.ecoprojects.dtos.organizationsDto.OrganizationResponseDto;

import java.util.List;

public interface OrganizationService {
    List<OrganizationResponseDto> findAll();
    OrganizationResponseDto findById(Long id);
    OrganizationResponseDto create(OrganizationRequestDto dto);
    OrganizationResponseDto update(Long id, OrganizationRequestDto dto);
    void delete(Long id);
}