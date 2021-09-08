package com.cloud.cinema.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BookingDTO {

    private String id;
    private String userId;
    private String showTimeId;
    private String movieId;
}
