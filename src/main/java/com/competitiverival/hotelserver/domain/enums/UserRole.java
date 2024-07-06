package com.competitiverival.hotelserver.domain.enums;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    USER,
    CUSTOMER,
    ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
