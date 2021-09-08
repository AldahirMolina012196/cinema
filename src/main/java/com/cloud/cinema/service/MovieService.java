package com.cloud.cinema.service;

import com.cloud.cinema.dto.MovieDTO;
import com.cloud.cinema.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(String movieId);

    Movie create(MovieDTO movieDTO);

    Movie delete(String movieId);
}
