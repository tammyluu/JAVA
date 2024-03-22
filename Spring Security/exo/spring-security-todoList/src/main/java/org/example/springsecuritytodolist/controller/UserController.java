package org.example.springsecuritytodolist.controller;

import org.example.springsecuritytodolist.dto.BaseResponseDto;
import org.example.springsecuritytodolist.dto.UserLoginDto;
import org.example.springsecuritytodolist.entity.User;
import org.example.springsecuritytodolist.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public BaseResponseDto registerUser(@RequestBody User newUser){
        if(userService.createUser(newUser)){
            return new BaseResponseDto("success");
        }else {
            return new BaseResponseDto("failed");
        }
    }

    @PostMapping("/login")
    public BaseResponseDto loginUser(@RequestBody UserLoginDto loginDetails){
        if(userService.checkUserNameExists(loginDetails.getEmail())){
            if(userService.verifyUser(loginDetails.getEmail(), loginDetails.getPassword())){
                Map<String, Object> data = new HashMap<>();

                data.put("token", userService.generateToken(loginDetails.getEmail(), loginDetails.getPassword()));
                return new BaseResponseDto( data);
            }else {

                return new BaseResponseDto("wrong password");
            }
        }else {

            return new BaseResponseDto("user not exist");
        }
    }
}
