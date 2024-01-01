package michael.learn;

public class MenuItem {
    private double price;
    public MenuItem(double p) {
        price = p;
    }
    public double getPrice() {
        return price;
    }
    public void makeItAMeal() {
        Combo meal = new Combo(this);
        price = meal.getComboPrice();
    }
}
