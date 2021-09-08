package com.cloud.cinema.exception;

import com.cloud.cinema.enums.CinemaErrorEnum;

public class CinemaException extends RuntimeException{
    public CinemaException(CinemaErrorEnum error){super(error.name());}
}
