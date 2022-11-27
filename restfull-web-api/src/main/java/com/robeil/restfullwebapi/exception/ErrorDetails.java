package com.robeil.restfullwebapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ErrorDetails {

    private LocalDateTime timeStamp;
    private String message;
    private String details;

}
