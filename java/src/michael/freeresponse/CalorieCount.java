package michael.freeresponse;

public class CalorieCount {
    private int caloriesLimit;
    private int caloriesIntake = 0;
    private int gramsOfProtein = 0;
    private int gramsOfCarbohydrate = 0;
    private int gramsOfFat = 0;

    public CalorieCount(int cal) {
        super();
        caloriesLimit = cal;
    }

    public void addMeal(int calories, int protein, int carbs, int fat) {
        caloriesIntake += calories;
        gramsOfProtein += protein;
        gramsOfCarbohydrate += carbs;
        gramsOfFat += fat;
    }

    public double getProteinPercentage() {
        return roundToTwoDigitDecimal(4.0 * gramsOfProtein / caloriesIntake);
    }

    public double getCarbPercentage() {
        return roundToTwoDigitDecimal(4.0 * gramsOfCarbohydrate / caloriesIntake);
    }

    public double getFatPercentage() {
        return roundToTwoDigitDecimal(9.0 * gramsOfFat / caloriesIntake);
    }

    public boolean onTrack() {
        return caloriesIntake <= caloriesLimit;
    }

    private double roundToTwoDigitDecimal(double num) {
        return ((double) Math.round(num * 100)) / 100;
    }
}