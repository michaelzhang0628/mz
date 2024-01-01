package michael.exam.apcsa06;

public class TimeInterval {
    int startTime;
    int endTime;
    
    public TimeInterval(int startTime, int endTime) {
        super();
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public boolean overlapsWith(TimeInterval interval) {
        /*
         * if (interval.getStartTime() < endTime && endTime <= interval.getEndTime()) {
         * return true; } else if (interval.getStartTime() <= startTime && startTime <
         * interval.getEndTime()) { return true; } else if (startTime <
         * interval.getStartTime() && endTime > interval.getEndTime()) { return true; }
         * else if (interval.getStartTime() < startTime && interval.getEndTime() >
         * endTime) { return true; } else if (interval.getStartTime() == startTime &&
         * interval.getEndTime() == endTime) { return true; } return false;
         * 
         */        
        /*
         * if (interval.getStartTime() < startTime && interval.getEndTime() <=
         * startTime) { return false; } else if (interval.getStartTime() >= endTime &&
         * interval.getEndTime() > endTime) { return false; } else if (startTime <
         * interval.getStartTime() && endTime <= interval.getStartTime()) { return
         * false; } else if (startTime >= interval.getEndTime() && endTime >
         * interval.getEndTime()) { return false; } return true;
         */
        int lateStart = interval.getStartTime() < startTime ? startTime : interval.getStartTime();
        int earlyEnd = interval.getEndTime() < endTime ? interval.getEndTime() : endTime;
        return lateStart < earlyEnd;
    }

    @Override
    public String toString() {
        return "TimeInterval [startTime=" + startTime + ", endTime=" + endTime + "]";
    }
}
