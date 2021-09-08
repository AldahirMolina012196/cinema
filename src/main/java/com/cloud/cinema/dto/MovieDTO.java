package com.cloud.cinema.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MovieDTO {

    private String id;
    private String title;
    private String director;
    private String rating;
}
