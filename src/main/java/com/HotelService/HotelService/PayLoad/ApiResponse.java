package com.HotelService.HotelService.PayLoad;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    private  String message;
    private boolean sucess;
    private HttpStatus status;
}
