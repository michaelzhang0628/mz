package michael.exam.apcsa03;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;


public class Company {
    private int retireAge;
    private int retireYears;
    private double retireSalary;
    private List<Employee> empList;
    
    public Company(int retireAge, int retireYears, double retireSalary, List<Employee> empList) {
        super();
        this.retireAge = retireAge;
        this.retireYears = retireYears;
        this.retireSalary = retireSalary;
        this.empList = empList;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public double salaryBudget() {
        double totalBudget = 0;
        for (int i = 0; i < empList.size(); i++) {
            totalBudget += empList.get(i).getSalary();
        }
        return totalBudget;
    }

    public void processRetirements() {
        Iterator<Employee> it = empList.iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (employeeIsElgible(e)) {
                it.remove();
            }
        } 
        Collections.sort(empList, new EmployeeComparator());
    }

    public boolean employeeIsElgible(Employee emp) {
        if (emp.getAge() >= retireAge && emp.getYearsOnJob() >= retireYears && emp.getSalary() >= retireSalary) {
            return true;
        }
        return false;
    }
}
