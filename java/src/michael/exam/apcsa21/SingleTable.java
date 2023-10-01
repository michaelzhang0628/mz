package michael.exam.apcsa21;

public class SingleTable {
    private int numSeats;
    private int height;
    private double viewQuality;
    
    public SingleTable(int numSeats, int height, double viewQuality) {
        super();
        this.numSeats = numSeats;
        this.height = height;
        this.viewQuality = viewQuality;
    }

    public int getNumSeats() {
        return numSeats;
    }
    
    public int getHeight() {
        return height;
    }
    
    public double getViewQuality() {
        return viewQuality;
    }
    
    public void setViewQuality(double value) {
        this.viewQuality = value;
    }
}
