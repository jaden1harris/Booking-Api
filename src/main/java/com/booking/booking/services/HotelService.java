package com.booking.booking.services;

import com.booking.booking.models.parse.Hotel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //lets Spring know that this is a service

public class HotelService
{
    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console

    public ArrayList<Hotel> retrieveHotels()
    {
        logger.info(Parse.isIsRootMode());
        final ArrayList<Hotel> hotels = new ArrayList<>();

        ParseQuery<Hotel> query = ParseQuery.getQuery(Hotel.class);
        try
        {
            List<Hotel> list = query.find();
            for (Hotel h : list)
            {
                //logger.info(h.toString()); //use if you want to see your hotels in the console
                hotels.add(h);
            }
        }
        catch(Exception e)
        {
            logger.error("Error occured", e);
        }
        logger.info(hotels.size());
        return hotels;
    }

    public Hotel getHotelById(String id)
    {
        Hotel hotel = null;

        //defines the query for the hotel class
        ParseQuery<Hotel> query = ParseQuery.getQuery(Hotel.class);
        try
        {
            hotel = query.get(id); //gets a single record based on ObjectId
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return hotel;
    }
}
