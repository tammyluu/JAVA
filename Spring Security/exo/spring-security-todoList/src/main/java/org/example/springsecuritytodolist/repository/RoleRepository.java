package org.example.springsecuritytodolist.repository;

import org.example.springsecuritytodolist.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
