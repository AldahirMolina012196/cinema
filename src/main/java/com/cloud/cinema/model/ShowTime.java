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
@Table(name = "show_time", schema = "public")
public class ShowTime {

    @Id
    private String id;
    @Column(name = "execution_date")
    private String executionDate;
    @Column(name = "movie_id")
    private String movieId;
}
