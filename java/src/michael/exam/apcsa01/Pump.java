package michael.exam.apcsa01;

public class Pump {
    private double gallonsSold;

    public Pump() {
        super();
        this.gallonsSold = 0.0;
    }
    
    public double getGallonsSold() {
        return gallonsSold;
    }
    
    public void setGallonsSold(double gallonsSold) {
        this.gallonsSold = gallonsSold;
    }

    public void resetGallonsSold() {
        gallonsSold = 0.0;
    }
}
