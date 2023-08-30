package michael.compare;

import java.util.Comparator;

public class HeightComparator implements Comparator<Person> {
    
    public int compare(Person o1, Person o2) {
        return o1.getHeight() - o2.getHeight();
    }

}
