package michael.freeresponse;

public class Employee extends Citizen {
    private double salary;

    public Employee(String name, String city, boolean isUSCitizen, double salary) {
        super(name, city, isUSCitizen);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getActualPay() {
        return salary;
    }
}
