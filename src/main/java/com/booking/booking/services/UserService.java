package com.booking.booking.services;

import com.booking.booking.models.parse.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //lets Spring know that this is a service

public class UserService
{
    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console

    public ArrayList<User> retrieveUsers()
    {
        logger.info(Parse.isIsRootMode());
        final ArrayList<User> users = new ArrayList<>();

        ParseQuery<User> query = ParseQuery.getQuery(User.class);
        try
        {
            List<User> list = query.find();
            for (User u : list)
            {
                //logger.info(u.toString()); //use if you want to see your users in the console
                users.add(u);
            }
        }
        catch(Exception e)
        {
            logger.error("Error occured", e);
        }
        logger.info(users.size());
        return users;
    }

    public User getUserById(String id)
    {
        User user = null;

        //defines the query for the hotel class
        ParseQuery<User> query = ParseQuery.getQuery(User.class);
        try
        {
            user = query.get(id); //gets a single record based on ObjectId
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return user;
    }
}
