package michael.freeresponse;

import java.util.ArrayList;

public class TravelPlan {
    private String destination;
    private ArrayList<Tour> tours = new ArrayList<Tour>();

    public ArrayList<Tour> getTours() {
        return tours;
    }

    TravelPlan(String destination) {
        this.destination = destination;
    }

    public boolean checkForConflict(Tour newTour) {
        int size = tours.size();
        for (int i = 0; i < size; i++) {
            if (checkTourConflict(tours.get(i), newTour)) {
                return true;
            }
        }
        return false;
    }

    boolean checkTourConflict(Tour existingTour, Tour newTour) {
        if (existingTour.getActDate() == newTour.getActDate()) {
            if (newTour.getEndTime() < existingTour.getStartTime()) {
                return false;
            }
            if (newTour.getStartTime() > existingTour.getEndTime()) {
                return false;
            }
            return true;
        }
        return false;
    }

    boolean addTour(Tour t) {
        if (checkForConflict(t)) {
            return false;
        } else {
            tours.add(t);
            return true;
        }
    }

}
