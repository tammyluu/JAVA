package org.example.springsecuritytodolist.repository;

import org.example.springsecuritytodolist.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findById(Long id);
    Optional<AppUser> findByEmail(String email);
}
