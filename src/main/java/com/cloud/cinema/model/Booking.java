package com.cloud.cinema.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ToString
@Entity
@Table(name = "booking", schema = "public")
public class Booking {
    @Id
    private String id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "show_time_id")
    private String showTimeId;
    @Column(name = "movie_id")
    private String movieId;
}
