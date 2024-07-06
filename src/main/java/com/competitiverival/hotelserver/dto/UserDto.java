package com.competitiverival.hotelserver.dto;

import com.competitiverival.hotelserver.domain.enums.UserRole;
import lombok.Data;


@Data
public class UserDto {

    private Long id;

    private String email;

    private String name;

    private UserRole userRole;

}
