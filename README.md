# Booking-Api
# ca02---booking-api-part-1-jaden1harris

**Overview**: This project built off last the assignment where I designed the Booking classes. I created Parse
database to hold some fake data and a backend API to communicate with your Parse Database.

### Required Stories

- [x] Create a Parse database your application. . ***(3 points)***
    - [x] The names of class fields should match the names presented in the last coding assignment (this includes casing)-
    - [x] For user, do not delete the existing User table that Parse creates, simply add the additional fields
    - [x] Include sample data
- [x] Create an endpoint for each of the major classes (Hotel, Room, User) ***(6 points)***
    - [x] Create the required models, controllers, and services
    - [x] Each controller should have at least 2 methods
        - [x] Get all
        - [x] Get by id
- [x] Document endpoints. ***(1 point)***
    - [x] Add to the README file the URI for each endpoint and a description
    
    All URIs start with: `http://localhost:8080/api/v1`

|Network|Description| 
|---|---| 
|`/hotel`|Retrieves all hotels| 
|`/hotel/{id}`| Retrieves a specific hotel based on it's ID|
|`/room`|Retrieves all rooms| 
|`/room/{id}`| Retrieves a specific room based on it's ID|
|`/user`|Retrieves all users| 
|`/user/{id}`| Retrieves a specific user based on it's ID|

### Stretch Stories

- [-]Create an endpoint that allows the used to sort descending or ascending. ***(5 points)***
    - Add this by using a query string (ie, `http://localhost:8080/api/v1/product/?sort=asc`)
    
![](https://github.com/jaden1harris/Booking-Api/blob/master/BookingAPI%20pt1.gif)    
    
