package com.aprendepe.categories.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Arrays;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundHandling(CategoryNotFoundException exception, WebRequest request){

        ErrorDetail errorDetail =
                new ErrorDetail(request.getDescription(false), Arrays.asList(exception.getMessage()));
        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }
}
