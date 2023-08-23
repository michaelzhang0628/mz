package michael.freeresponse;

public class WashingMachine extends DiscountItem {
    private double installationCost;

    public WashingMachine(double price, double discountRate, double insCost) {
        super(price, discountRate, "washing machine");
        installationCost = insCost;
    }

    public double getInstalltionCost() {
        return installationCost;
    }

    public double getTotalPrice() {
        return getPrice() + installationCost;
    }

    @Override
    public double salePrice() {
        return getTotalPrice() - getTotalPrice() * getRate();
    }

    public final static void main(String[] args) {
        WashingMachine wm = new WashingMachine(500, 0.1, 50);
        System.out.println("Installation Cost: " + wm.getInstalltionCost());
        System.out.println("Total Price: " + wm.getTotalPrice());
        System.out.println("Sales Price: " + wm.salePrice());
    }
}
