package com.booking.booking.controllers;

import com.booking.booking.models.parse.Hotel;
import com.booking.booking.models.serializable.SerializableHotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.booking.booking.services.HotelService;

import java.util.ArrayList;

@RestController //identified this class a controller used for REST API class.
@RequestMapping("/api/v1/hotel") //sets up the base url for all calls to methods in this file

public class HotelController
{
    private HotelService hotelService;

    public HotelController(HotelService hotelService)
    {
        this.hotelService = hotelService;
    }

    //get all
    @GetMapping("/") //sets the path to this method
    public ArrayList<SerializableHotel> getHotels()
    {
        ArrayList<SerializableHotel> hotels = new ArrayList<>();

        //Convert the Parse Hotel object to a POJO Hotel object that can be serialized by Spring
        ArrayList<Hotel> list = hotelService.retrieveHotels();
        for(Hotel h : list)
        {
            hotels.add(h.getSerializable());
        }
        return hotels;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializableHotel getHotelById(@PathVariable String id)
    {
        return hotelService.getHotelById(id).getSerializable();
    }
}
