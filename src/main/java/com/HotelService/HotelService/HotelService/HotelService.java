package com.HotelService.HotelService.HotelService;
import com.HotelService.HotelService.Entity.Hotel;
import  java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);
}
