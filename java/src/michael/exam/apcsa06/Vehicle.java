package michael.exam.apcsa06;

public class Vehicle extends TaxableItem{
    private double dealerCost;
    private double dealerMarkup;
    
    public Vehicle(double rate, double cost, double markup) {
        super(rate);
        this.dealerCost = cost;
        this.dealerMarkup = markup;
    }

    @Override
    public double getListPrice() {
        return dealerCost + dealerMarkup;
    }
    
    public void changeMarkup(double newMarkup){
        dealerMarkup = newMarkup;
    }
}
