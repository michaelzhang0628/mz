package michael.exam.apcsa03;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CompanyTest {

    public Company aCompany() {
        List<Employee> listOfEmployee = new ArrayList<Employee> ();
        listOfEmployee.add(new Employee(60, 21, 110000, 0));
        listOfEmployee.add(new Employee(30, 18, 125000, 2));
        listOfEmployee.add(new Employee(55, 15, 90000, 1));
        listOfEmployee.add(new Employee(45, 30, 200000, 3));
        Company c = new Company(50, 20, 100000, listOfEmployee);
        return c;
    }
    
    @Test
    void testEmployeeIsElgible() {
        Company c = aCompany();
        assertTrue(c.employeeIsElgible(new Employee(60, 21, 110000, 0)));
        assertFalse(c.employeeIsElgible(new Employee(30, 18, 125000, 2)));
        assertFalse(c.employeeIsElgible(new Employee(55, 15, 90000, 1)));
        assertFalse(c.employeeIsElgible(new Employee(45, 30, 200000, 3)));
    }
    
    @Test
    void testProcessRetirements() {
        Company c = aCompany();
        c.processRetirements();
        List<Employee> expected = new ArrayList<Employee> ();
        expected.add(new Employee(55, 15, 90000, 1));
        expected.add(new Employee(30, 18, 125000, 2));
        expected.add(new Employee(45, 30, 200000, 3));
        assertEquals(expected, c.getEmpList());
    }

}
