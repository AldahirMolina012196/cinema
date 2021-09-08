package com.cloud.cinema.service.impl;

import com.cloud.cinema.dto.UserDTO;
import com.cloud.cinema.enums.CinemaErrorEnum;
import com.cloud.cinema.exception.CinemaException;
import com.cloud.cinema.model.User;
import com.cloud.cinema.repository.UserRepository;
import com.cloud.cinema.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User create(UserDTO userDTO) {
        if (Objects.nonNull(userDTO.getName()) && Objects.nonNull(userDTO.getLastName())) {
            if (userRepository.existsById(userDTO.getId())) {
                return userRepository.save(User.builder()
                        .id(userDTO.getId())
                        .name(userDTO.getName())
                        .lastName(userDTO.getLastName())
                        .build());
            } else {
                return userRepository.save(User.builder()
                        .id(UUID.randomUUID().toString())
                        .name(userDTO.getName())
                        .lastName(userDTO.getLastName())
                        .build());
            }
        } else {
            throw new CinemaException(CinemaErrorEnum.REQUIRE_DATA_IN_REQUEST);
        }
    }

    @Override
    public String delete(String userId) {
        if (Objects.nonNull(userId)) {
            if (userRepository.existsById(userId)) {
                userRepository.deleteById(userId);
                return "PROCESS DELETE SUCCESS";
            } else {
                return "PROCESS DELETE FAILED";
            }
        } else {
            throw new CinemaException(CinemaErrorEnum.USER_ID_NOT_FOUND);
        }
    }
}
