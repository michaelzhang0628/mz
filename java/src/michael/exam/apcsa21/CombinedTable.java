package michael.exam.apcsa21;

public class CombinedTable {

    private SingleTable t1;
    private SingleTable t2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        super();
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public boolean canSeat(int x) {
        if (t1.getNumSeats() + t2.getNumSeats() - 2 >= x) {
            return true;
        }
        return false;
    }
    
    public double getDesirability() {
        if (t1.getHeight() == t2.getHeight()) {
            return (t1.getViewQuality() + t2.getViewQuality()) / 2;
        }
        return (t1.getViewQuality() + t2.getViewQuality()) / 2 - 10;
    }
}
