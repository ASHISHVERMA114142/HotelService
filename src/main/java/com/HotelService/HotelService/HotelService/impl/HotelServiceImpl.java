package com.HotelService.HotelService.HotelService.impl;

import com.HotelService.HotelService.Entity.Hotel;
import com.HotelService.HotelService.HotelService.HotelService;
import com.HotelService.HotelService.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.HotelService.HotelService.Exception.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String ramdomHotelId= UUID.randomUUID().toString();
        hotel.setId(ramdomHotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id is not found !!!!"));
    }
}
