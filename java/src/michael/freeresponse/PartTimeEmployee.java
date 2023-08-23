package michael.freeresponse;

public class PartTimeEmployee extends Employee {
    private double fraction;
    private boolean isUnionMember;

    public PartTimeEmployee(String aName, String aCity, boolean isCitizen, double aAnnualSalary, double aFraction,
            boolean isMember) {
        super(aName, aCity, isCitizen, aAnnualSalary);
        fraction = aFraction;
        isUnionMember = isMember;
    }

    public double getFraction() {
        return fraction;
    }

    public boolean isUnionMember() {
        return isUnionMember;
    }

    public void changeUnionStatus() {
        if (super.getSalary() > 15000) {
            this.isUnionMember = !this.isUnionMember;
        }
    }

    @Override
    public double getActualPay() {
        return super.getActualPay() * fraction;
    }
}
