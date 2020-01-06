package fr.slickteam.training.cleancode.trip;

import fr.slickteam.training.cleancode.exception.CollaboratorCallException;
import fr.slickteam.training.cleancode.user.User;

import java.util.List;

public class TripDAO {

    public static List<Trip> findTripsByUser(User user) {
        throw new CollaboratorCallException(
                "TripDAO should not be invoked on an unit test.");
    }
}
