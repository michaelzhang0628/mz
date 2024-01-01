package michael.exam.apcsa11;

public class FuelTankImpl implements FuelTank{
    private int fuelLevel;
    
    public FuelTankImpl(int fuelLevel) {
        super();
        this.fuelLevel = fuelLevel;
    }
    
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

}
