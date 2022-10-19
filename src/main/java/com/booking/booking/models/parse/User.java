package com.booking.booking.models.parse;

import com.booking.booking.models.serializable.SerializableUser;
import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;

import java.util.ArrayList;

@ParseClassName("User")
public class User extends ParseObject
{
    private final String ID = "id";
    private final String USERNAME = "username";
    private final String EMAIL = "email";
    private final String COUNTRY = "country";
    private final String IMG = "img";
    private final String CITY = "city";
    private final String PHONE = "phone";
    private final String IS_ADMIN = "isAdmin";

    public String getId()
    {
        return getString(ID);
    }

    public void setId(String id)
    {
        put(ID, id);
    }

    public String getUsername()
    {
        return getString(USERNAME);
    }

    public void setUsername(String username)
    {
        put(USERNAME, username);
    }

    public String getEmail()
    {
        return getString(EMAIL);
    }

    public void setEmail(String email)
    {
        put (EMAIL, email);
    }

    public String getCountry()
    {
        return getString(COUNTRY);
    }

    public void setCountry(String country)
    {
        put(COUNTRY, country);
    }

    public String getImg()
    {
        return getString(IMG);
    }

    public void setImg(String img)
    {
        put(IMG, img);
    }

    public String getCity()
    {
        return getString(CITY);
    }

    public void setCity(String city)
    {
        put(CITY, city);
    }

    public String getPhone()
    {
        return getString(PHONE);
    }

    public void setPhone(String phone)
    {
        put(PHONE, phone);
    }

    public boolean getIsAdmin()
    {
        return getBoolean(IS_ADMIN);
    }

    public void setIsAdmin(boolean isAdmin)
    {
        put(IS_ADMIN, isAdmin);
    }

    private JSONArray createJSONArray(ArrayList<?> arr)
    {
        JSONArray list = new JSONArray();
        for (Object s : arr)
            list.put(s);

        return list;
    }

    public SerializableUser getSerializable()
    {
        return new SerializableUser(
                getObjectId(), getId(), getUsername(), getEmail(),
                getCountry(), getImg(), getCity(), getPhone(),
                getIsAdmin()
        );
    }
}
