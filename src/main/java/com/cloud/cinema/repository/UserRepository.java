package com.cloud.cinema.repository;

import com.cloud.cinema.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, String> {
}
