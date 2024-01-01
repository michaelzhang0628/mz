package michael.exam.apcsa06;

public class Appointment {
    private TimeInterval interval;
    
    public Appointment(int startTime, int endTime) {
        this.interval = new TimeInterval(startTime, endTime);
    }

    public TimeInterval getTime() {
        return this.interval;
    }
    
    public boolean conflictWith(Appointment other) {
        return getTime().overlapsWith(other.getTime());
    }
    
    @Override
    public String toString() {
        return "Appointment [startTime=" + interval.getStartTime() + ", endTime=" + interval.getEndTime() + "]";
    }
}
