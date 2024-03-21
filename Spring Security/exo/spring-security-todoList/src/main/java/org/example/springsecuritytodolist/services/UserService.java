package org.example.springsecuritytodolist.services;

import org.example.springsecuritytodolist.entity.AppUser;
import org.example.springsecuritytodolist.entity.Role;
import org.example.springsecuritytodolist.repository.RoleRepository;
import org.example.springsecuritytodolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public void createUser(AppUser user){
        userRepository.save(user);
        System.out.println("user created !!!");
    }
    public AppUser getAppUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }

    public void assignRoleToUser(Long userId, Long roleId) {
        AppUser user = userRepository.findById(userId).orElse(null);
        Role role = roleRepository.findById(roleId).orElse(null);
        if (user != null && role != null) {
            user.setRole(role);
            userRepository.save(user);
        }
    }


}
