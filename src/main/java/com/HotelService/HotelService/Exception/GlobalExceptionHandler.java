package com.HotelService.HotelService.Exception;


import com.HotelService.HotelService.PayLoad.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResouceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        String message = resourceNotFoundException.getMessage();
        ApiResponse apiResponse= ApiResponse.builder().message(message).sucess(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
    }
}
