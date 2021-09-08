package com.cloud.cinema.repository;

import com.cloud.cinema.model.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, String> {
}
