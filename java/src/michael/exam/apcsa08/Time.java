package michael.exam.apcsa08;

public class Time {
    // t must be in minutes from 12:00 A.M.
    int t;
    
    public Time(int t) {
        this.t = t;
    }
    
    //11:30 AM
    public Time(String t) {
        String[] parts = t.split(":");
        int hours = Integer.parseInt(parts[0]);
        String[] secondParts = parts[1].split(" ");
        int minutes = Integer.parseInt(secondParts[0]);
        if (hours == 12) {
            hours = 0;
        }
        if (secondParts[1].equalsIgnoreCase("am")) {
            this.t = hours * 60 + minutes;
        } else {
            this.t = (hours + 12) * 60 + minutes;
        }
    }
    
    public int getTime() {
        return t;
    }
    
    public int minutesUntil(Time other) {
        return (other.getTime() - t);
    }
}
