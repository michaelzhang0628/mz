package michael.exam.apcsa06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void testCompareCustomer() {
        Customer c1 = new Customer("Smith", 1001);
        Customer c2 = new Customer("Anderson", 1002);
        Customer c3 = new Customer("Smith", 1003);
        Customer c4 = new Customer("Smith", 1001);
        assertEquals(0, c1.compareCustomer(c1));
        assertEquals(0, c1.compareCustomer(c4));
        assertTrue(c1.compareCustomer(c2) > 0);
        assertTrue(c1.compareCustomer(c3) < 0);
    }
    
    @Test
    void testPrefixMerge() {
        Customer[] list1 = new Customer[8];
        list1[0] = new Customer("Arthur", 4920);
        list1[1] = new Customer("Burton", 3911);
        list1[2] = new Customer("Burton", 4944);
        list1[3] = new Customer("Franz", 1692);
        list1[4] = new Customer("Horton", 9221);
        list1[5] = new Customer("Jones", 5554);
        list1[6] = new Customer("Miller", 9360);
        list1[7] = new Customer("Nguyen", 4339);
        Customer[] list2 = new Customer[7];
        list2[0] = new Customer("Aaron", 1729);
        list2[1] = new Customer("Baker", 2921);
        list2[2] = new Customer("Burton", 3911);
        list2[3] = new Customer("Dillard", 6552);
        list2[4] = new Customer("Jones", 5554);
        list2[5] = new Customer("Miller", 9360);
        list2[6] = new Customer("Noble", 3335);
        Customer[] result = new Customer[6];
        Customer.prefixMerge(list1, list2, result);
        Customer[] expected = new Customer[6];
        expected[0] = new Customer("Aaron", 1729);
        expected[1] = new Customer("Arthur", 4920);
        expected[2] = new Customer("Baker", 2921);
        expected[3] = new Customer("Burton", 3911);
        expected[4] = new Customer("Burton", 4944);
        expected[5] = new Customer("Dillard", 6552);
        assertArrayEquals(expected, result);
    }

}
