package com.booking.booking.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.booking.booking.models.RoomNumber;

import java.util.ArrayList;

@Data //creates setters and getters automatically
@AllArgsConstructor //creates constructor with all values automatically
@NoArgsConstructor //creates no argument constructor automatically

public class SerializableRoom
{
    private String id;
    private String title;
    private double price;
    private int maxPeople;
    private ArrayList<RoomNumber> roomNumbers;

    public SerializableRoom(String objectId, String id, String title, double price, int maxPeople, ArrayList<RoomNumber> roomNumbers) {
    }
}
