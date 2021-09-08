package com.cloud.cinema.controller;

import com.cloud.cinema.dto.UserDTO;
import com.cloud.cinema.model.User;
import com.cloud.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody UserDTO userDTO){
        return userService.create(userDTO);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable(value = "id") String id){
        return userService.delete(id);
    }

}
