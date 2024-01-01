package michael.exam.apcsa03;

import java.util.Objects;

public class Employee {
    private int age;
    private int yearsOnJob;
    private double salary;
    private int ID;
    
    public Employee(int age, int yearsOnJob, double salary, int iD) {
        super();
        this.age = age;
        this.yearsOnJob = yearsOnJob;
        this.salary = salary;
        this.ID = iD;
    }

    public int getAge() {
        return age;
    }
    
    public int getYearsOnJob() {
        return yearsOnJob;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public int getID() {
        return ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, age, salary, yearsOnJob);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee other = (Employee) obj;
        return ID == other.ID && age == other.age
                && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
                && yearsOnJob == other.yearsOnJob;
    }
}
