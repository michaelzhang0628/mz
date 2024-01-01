package michael.exam.apcsa14;

public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public double getPrice() {
        MenuItem cheapest = drink;

        if (sandwich.getPrice() < cheapest.getPrice()) {
            cheapest = sandwich;
        }
        if (salad.getPrice() < cheapest.getPrice()) {
            cheapest = salad;
        }
        return drink.getPrice() + sandwich.getPrice() + salad.getPrice() - cheapest.getPrice();
    }
}