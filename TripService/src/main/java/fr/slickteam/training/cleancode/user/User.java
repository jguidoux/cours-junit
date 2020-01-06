package fr.slickteam.training.cleancode.user;

import fr.slickteam.training.cleancode.trip.Trip;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Trip> trips = new ArrayList<Trip>();
    private List<User> friends = new ArrayList<User>();
    private String username;
    private String lastname;

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public List<Trip> trips() {
        return trips;
    }


    public String getFullname() {
        if (this.username != null && this.lastname != null) {
            return this.username + ' ' + this.lastname;
        }
        return "";
    }
}

