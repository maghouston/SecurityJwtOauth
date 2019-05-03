package com.example.SpringSecurity.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;



@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {
    private static Logger LOGGER = LoggerFactory.getLogger(RestControllerAdvice.class);
    @ExceptionHandler(value = {VehicleNotFoundException.class})
    public ResponseEntity vehicleNotFound(VehicleNotFoundException ex, WebRequest request) {
        LOGGER.debug("handling VehicleNotFoundException...");
        return new ResponseEntity(ex, HttpStatus.NOT_FOUND);
    }
}
