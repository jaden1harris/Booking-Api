package com.booking.booking.services;

import com.booking.booking.models.parse.Room;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //lets Spring know that this is a service

public class RoomService
{
        protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console

        public ArrayList<Room> retrieveRooms()
        {
            logger.info(Parse.isIsRootMode());
            final ArrayList<Room> rooms = new ArrayList<>();

            ParseQuery<Room> query = ParseQuery.getQuery(Room.class);
            try
            {
                List<Room> list = query.find();
                for (Room r : list)
                {
                    //logger.info(r.toString()); //use if you want to see your rooms in the console
                    rooms.add(r);
                }
            }
            catch(Exception e)
            {
                logger.error("Error occured", e);
            }
            logger.info(rooms.size());
            return rooms;
        }

        public Room getRoomById(String id)
        {
            Room room = null;

            //defines the query for the room class
            ParseQuery<Room> query = ParseQuery.getQuery(Room.class);
            try
            {
                room = query.get(id); //gets a single record based on ObjectId
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            return room;
        }
}
