package michael.exam.apcsa14;

import java.util.List;

public class SeatingChart {
    private Student[][] seats;

    public SeatingChart(List<Student> studentList, int rows, int cols) {
        seats = new Student[rows][cols];
        int seatIndex = 0;
        for (int i = 0; i < seats[0].length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if (seatIndex < studentList.size()) {
                    seats[j][i] = studentList.get(seatIndex);
                    seatIndex++;
                }
            }
        }
    }

    public int removeAbsentStudents(int allowedAbsences) {
        int removed = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (seats[i][j] != null && seats[i][j].getAbsenceCount() > allowedAbsences) {
                    seats[i][j] = null;
                    removed++;
                }
            }
        }

        return removed;
    }
    
    public Student getStudent(int row, int col) {
        if (row < seats.length && col < seats[0].length) {
            return seats[row][col];
        }
        return null;
    }
}
