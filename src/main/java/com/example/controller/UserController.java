package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "ap/user")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/add")
    private ResponseEntity<String> addUser(@RequestBody User user){

        userService.addUser(user);
        return ResponseEntity.ok("User Added Successfully");
    }
}
