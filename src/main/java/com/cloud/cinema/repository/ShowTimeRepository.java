package com.cloud.cinema.repository;

import com.cloud.cinema.model.ShowTime;
import org.springframework.data.repository.CrudRepository;

public interface ShowTimeRepository extends CrudRepository<ShowTime, String> {
}
