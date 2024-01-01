package michael.exam.apcsa11;

import java.util.List;

public class FuelDepot {
    private FuelRobot filler;
    private List<FuelTank> tanks;

    public FuelDepot(FuelRobot filler, List<FuelTank> tanks) {
        super();
        this.filler = filler;
        this.tanks = tanks;
    }

    public FuelRobot getFiller() {
        return filler;
    }
    
    public int nextTankToFill(int threshold) {
        int tankWithLeastFuel = 0;
        for (int i = 1; i < tanks.size(); i++) {
            if (tanks.get(i).getFuelLevel() < tanks.get(tankWithLeastFuel).getFuelLevel()) {
                tankWithLeastFuel = i;
            }
        }
        if (tanks.get(tankWithLeastFuel).getFuelLevel() <= threshold) {
            return tankWithLeastFuel;
        } else {
            return filler.getCurrentIndex();
        }
    }

    public void moveToLocation(int locIndex) {
        if ((locIndex > filler.getCurrentIndex() && !filler.isFacingRight()) 
                || (locIndex < filler.getCurrentIndex() && filler.isFacingRight())) {
            filler.changeDirection();
        }
        filler.moveForward(Math.abs(locIndex - filler.getCurrentIndex()));
    }
}
