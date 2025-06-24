package com.liamfer.markdownAPI;

import com.liamfer.markdownAPI.DTO.apiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionCatcher {

    @ExceptionHandler
    public ResponseEntity<apiError> defaultHandler(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new apiError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage()));
    }
}
