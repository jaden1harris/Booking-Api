package com.booking.booking.controllers;

import com.booking.booking.models.parse.User;
import com.booking.booking.models.serializable.SerializableUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.booking.booking.services.UserService;

import java.util.ArrayList;

@RestController //identified this class a controller used for REST API class.
@RequestMapping("/api/v1/user") //sets up the base url for all calls to methods in this file


public class UserController
{
    private UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    //get all
    @GetMapping("/") //sets the path to this method
    public ArrayList<SerializableUser> getUsers()
    {
        ArrayList<SerializableUser> users = new ArrayList<>();

        //Convert the Parse User object to a POJO User object that can be serialized by Spring
        ArrayList<User> list = userService.retrieveUsers();
        for (User u : list)
        {
            users.add(u.getSerializable());
        }
        return users;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializableUser getUserById(@PathVariable String id)
    {
        return userService.getUserById(id).getSerializable();
    }
}
