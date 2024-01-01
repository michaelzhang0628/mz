package michael.exam.apcsa02;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private Seat[][] flight;

    public Flight(Seat[][] flight) {
        super();
        this.flight = flight;
    }

    public Seat[][] getFlight() {
        return flight;
    }

    public int emptySeatCount(String seatType) {
        int numOfEmptySeats = 0;
        for (int i = 0; i < flight.length; i++) {
            for (int j = 0; j < flight[0].length; j++) {
                if (flight[i][j].getType().equals(seatType) || seatType.equals("any")) {
                    if (flight[i][j].getPassenger().getName().equals("")) {
                        numOfEmptySeats++;
                    }
                }
            }
        }
        return numOfEmptySeats;
    }

    public int findBlock(int row, int seatsNeeded) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < flight[row].length; i++) {
            if (flight[row][i].getPassenger().getName().equals("")) {
                if (index == -1) {
                    index = i;
                }
                count++;
                if (count == seatsNeeded) {
                    return index;
                }
            } else {
                index = -1;
                count = 0;
            }
        }
        return -1;
    }

    public boolean assignGroups(Passenger[] group) {
        for (int i = 0; i < flight.length; i++) {
            int block = findBlock(i, group.length);
            if (block != -1) {
                for (int j = 0; j < group.length; j++) {
                    flight[i][block + j] = new Seat(group[j], flight[i][block + j].getType());
                }
                return true;
            }
        }
        return false;
    }
}

