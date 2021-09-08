package com.cloud.cinema.service;

import com.cloud.cinema.dto.ShowTimeDTO;
import com.cloud.cinema.model.ShowTime;

import java.util.List;

public interface ShowTimeService {

    List<ShowTime> findAll();

    ShowTime findById(String showTimeDTO);

    ShowTime create(ShowTimeDTO showTimeDTO);

    ShowTime delete(String showTimeId);
}
