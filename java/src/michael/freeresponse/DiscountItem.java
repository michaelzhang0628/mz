package michael.freeresponse;

public class DiscountItem extends Object {
    private double price;
    private double discountRate;
    private String description;

    public DiscountItem(double thePrice, double rate, String descr) {
        price = thePrice;
        discountRate = rate;
        description = descr;
    }

    public double getPrice() {
        return price;
    }

    public double getRate() {
        return discountRate;
    }

    public String getDescription() {
        return description;
    }

    public double salePrice() {
        return price - discountRate * price;
    }
}
