package com.cloud.cinema.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ShowTimeDTO {

    private String id;
    private String executionDate;
    private String movieId;
}
