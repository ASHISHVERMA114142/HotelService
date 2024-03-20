package com.HotelService.HotelService.Controller;

import com.HotelService.HotelService.Entity.Hotel;
import com.HotelService.HotelService.HotelService.HotelService;
import com.HotelService.HotelService.HotelService.impl.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @PostMapping("/add")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel Hotel1=hotelService.create(hotel);
        return new ResponseEntity<>(Hotel1, HttpStatus.OK);
    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){
        Hotel hotel=hotelService.get(hotelId);
        return new ResponseEntity<>(hotel,HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public  ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> allHotel=hotelService.getAll();
        return new ResponseEntity<>(allHotel,HttpStatus.OK);
    }

}
