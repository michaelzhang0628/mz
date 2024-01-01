package michael.exam.apcsa01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Station {
    private double myBasePrice;
    private Pump[] myPumps;

    public Station(double myBasePrice, Pump[] myPumps) {
        super();
        this.myBasePrice = myBasePrice;
        this.myPumps = myPumps;
    }
    
    public Pump[] getPumps() {
        return this.myPumps;
    }

    public double totalSales() {
        double totalPrice = myPumps[0].getGallonsSold() * (myBasePrice + 0.25)
                + myPumps[1].getGallonsSold() * (myBasePrice + 0.25);
        for (int i = 2; i < myPumps.length; i++) {
            totalPrice += myPumps[i].getGallonsSold() * myBasePrice;
        }
        return totalPrice;
    }

    public void resetAll() {
        for (int i = 0; i < myPumps.length; i++) {
            myPumps[i].resetGallonsSold();
        }
    }

    public void closeStation() throws IOException {
        OutputStream out = new FileOutputStream("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa01/station-total-sales.txt");
        PrintStream p = new PrintStream(out);
        p.print("Michael says the total sales for this station is: $");
        p.println(totalSales());
        p.println("Michael says bye!");
        out.close();
        resetAll();
    }

}
