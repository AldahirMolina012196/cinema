package com.cloud.cinema.repository;

import com.cloud.cinema.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, String> {
}
