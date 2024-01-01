package michael.exam.apcsa08;

import java.util.ArrayList;

import michael.exam.apcsa09.NumberTile;

public class Trip {
    public ArrayList<Flight> flights;

    public Trip(ArrayList<Flight> flights) {
        this.flights = flights;
    }
    
    public int getDuration() {
        if (flights.size() == 0) {
            return 0;
        }
        return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size() - 1).getArrivalTime());
    }

    public int getShortestLayover() {
        if (flights.size() < 2) {
            return -1;
        }
        int shortestLayover = flights.get(0).getArrivalTime().minutesUntil(flights.get(1).getDepartureTime());
        for (int i = 2; i < flights.size(); i++) {
            int layover = flights.get(i - 1).getArrivalTime().minutesUntil(flights.get(i).getDepartureTime());
            if (layover < shortestLayover) {
                shortestLayover = layover;
            }
        }
        return shortestLayover;
    }
}
