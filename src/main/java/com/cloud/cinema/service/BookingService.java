package com.cloud.cinema.service;

import com.cloud.cinema.dto.BookingDTO;
import com.cloud.cinema.model.Booking;

import java.util.List;

public interface BookingService {

    List<Booking> findAll();

    Booking create(BookingDTO bookingDTO);

    Booking findById(String bookingId);

    Booking findByUserId(String userId);

    Booking delete(String bookingId);
}
