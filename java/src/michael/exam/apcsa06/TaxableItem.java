package michael.exam.apcsa06;

public abstract class TaxableItem implements Item {
    private double taxRate;
    
    public abstract double getListPrice();
    
    public TaxableItem(double rate) {
        taxRate = rate;
    }
    
    public double purchasePrice() {
        double tax = getListPrice() * taxRate;
        return getListPrice() + tax;
    }
}
