package com.cloud.cinema.service;

import com.cloud.cinema.dto.UserDTO;
import com.cloud.cinema.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User create(UserDTO userDTO);

    String delete(String userId);
}
