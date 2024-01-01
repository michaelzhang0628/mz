package michael.exam.apcsa06;

import java.util.Objects;

public class Customer {
    private String name;
    private int id;

    public Customer(String name, int idNum) {
        this.name = name;
        id = idNum;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public int compareCustomer(Customer other) {
        if (getName().equals(other.getName())) {
            return getID() - other.getID();
        }
        return getName().compareTo(other.getName());
    }

    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {
        int list1Index = 0;
        int list2Index = 0;
        for (int i = 0; i < result.length; i++) {
            int comparison = list1[list1Index].compareCustomer(list2[list2Index]);
            if (comparison < 0) {
                result[i] = list1[list1Index];
                list1Index++;
            } else if (comparison > 0) {
                result[i] = list2[list2Index];
                list2Index++;
            } else {
                result[i] = list1[list1Index];
                list1Index++;
                list2Index++;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Customer))
            return false;
        Customer other = (Customer) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
    
    
}
