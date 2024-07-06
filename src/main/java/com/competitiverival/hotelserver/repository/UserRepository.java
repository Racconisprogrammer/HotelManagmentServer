package com.competitiverival.hotelserver.repository;

import com.competitiverival.hotelserver.domain.User;
import com.competitiverival.hotelserver.domain.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);

    Optional<User> findByUserRole(UserRole userRole);
}
