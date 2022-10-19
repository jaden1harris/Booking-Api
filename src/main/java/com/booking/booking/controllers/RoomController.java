package com.booking.booking.controllers;

import com.booking.booking.models.parse.Room;
import com.booking.booking.models.serializable.SerializableRoom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.booking.booking.services.RoomService;

import java.util.ArrayList;

@RestController //identified this class a controller used for REST API class.
@RequestMapping("/api/v1/room") //sets up the base url for all calls to methods in this file

public class RoomController
{
    private RoomService roomService;

    public RoomController(RoomService roomService)
    {
        this.roomService = roomService;
    }

    //get all
    @GetMapping("/") //sets the path to this method
    public ArrayList<SerializableRoom> getRooms()
    {
        ArrayList<SerializableRoom> rooms = new ArrayList<>();

        //Convert the Parse Room object to a POJO Room object that can be serialized by Spring
        ArrayList<Room> list = roomService.retrieveRooms();
        for(Room r : list)
        {
            rooms.add(r.getSerializable());
        }
        return rooms;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializableRoom getRoomById(@PathVariable String id)
    {
        return roomService.getRoomById(id).getSerializable();
    }
}
