package michael.exam.apcsa09;

public class BatteryCharger {
    private int[] rateTable;
    
    public BatteryCharger(int[] rateTable) {
        this.rateTable = rateTable;
    }
    
    public int getChargingCost(int startHour, int chargeTime) {
        int cost = 0;
        int rIndex = startHour;
        for (int i = 0; i < chargeTime; i++) {
            cost += rateTable[rIndex];
            rIndex++;
            if (rIndex == rateTable.length) {
                rIndex = 0;
            }
        }
        return cost;
    }

    public int getChargeStartTime(int chargeTime) {
        int cheapestStartHour = 0;
        for (int startHour = 1; startHour < rateTable.length; startHour++) {
            if (getChargingCost(startHour, chargeTime) < getChargingCost(cheapestStartHour, chargeTime)) {
                cheapestStartHour = startHour;
            }
        }
        return cheapestStartHour;
    }
}
