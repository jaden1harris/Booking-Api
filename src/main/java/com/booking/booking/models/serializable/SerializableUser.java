package com.booking.booking.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //creates setters and getters automatically
@AllArgsConstructor //creates constructor with all values automatically
@NoArgsConstructor //creates no argument constructor automatically

public class SerializableUser
{
    private String id;
    private String username;
    private String email;
    private String country;
    private String img;
    private String city;
    private String phone;
    private boolean isAdmin;

    public SerializableUser(String objectId, String id, String username, String email, String country, String img, String city, String phone, boolean isAdmin) {
    }
}
