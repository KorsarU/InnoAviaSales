package innopolis.project.e4.answers;

import innopolis.project.e4.models.Flight;

import java.util.List;

/**
 * Created by Xomak on 15.07.2016.
 * Stores answer on user's request for a round trip
 */
public class OneWaySearchAnswer extends SearchAnswer {
    private List<Flight> flights;

    public OneWaySearchAnswer(final List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
