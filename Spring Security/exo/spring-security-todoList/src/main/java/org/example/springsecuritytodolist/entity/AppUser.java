package org.example.springsecuritytodolist.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true,nullable = false)
    private String email;

    private String password;

    @OneToOne(cascade = CascadeType.ALL, optional = true) // Optional role
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
}
