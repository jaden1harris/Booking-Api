package com.booking.booking.models.serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.booking.booking.models.parse.Room;

import java.util.ArrayList;

@Data //creates setters and getters automatically
@AllArgsConstructor //creates constructor with all values automatically
@NoArgsConstructor //creates no argument constructor automatically

public class SerializableHotel
{
    private String id;
    private String name;
    private String type;
    private String city;
    private String address;
    private String distance;
    private ArrayList<String> photos;
    private String title;
    private int rating;
    private ArrayList<Room> rooms;
    private double cheapestPrice;
    private boolean featured;

    public SerializableHotel(String objectId, String id, String name, String type, String city, String address, String distance, ArrayList<String> photos, String title, int rating, ArrayList<Room> rooms, double cheapestPrice, boolean featured) {
    }
}
