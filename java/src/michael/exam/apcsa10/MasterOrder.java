package michael.exam.apcsa10;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class MasterOrder {
    private List<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int numBoxes = 0;
        for (int i = 0; i < orders.size(); i++) {
            numBoxes += orders.get(i).getNumBoxes();
        }
        return numBoxes;
    }

    public int removeVariety(String cookieVar) {
        int boxesRemoved = 0;
        Iterator<CookieOrder> it = orders.iterator();
        while (it.hasNext()) {
            CookieOrder i = it.next();
            if (cookieVar.equals(i.getVariety())) {
                boxesRemoved += i.getNumBoxes();
                it.remove();
            }
        }
        return boxesRemoved;
    }
}
