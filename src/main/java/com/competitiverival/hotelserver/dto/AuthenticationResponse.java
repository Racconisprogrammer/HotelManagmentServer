package com.competitiverival.hotelserver.dto;


import com.competitiverival.hotelserver.domain.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;

    private Long userId;

    private UserRole userRole;
}
