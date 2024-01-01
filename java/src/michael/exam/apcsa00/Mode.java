package michael.exam.apcsa00;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class Mode {
    private int[] data;
    
    public Mode(int[] data) {
        super();
        this.data = data;
    }

    public boolean isMode(int k) {
        // GZ replaced == with <= or >=
        if (k <= 0 || k >= data.length - 1 || data[k] <= data[k - 1] || data[k] <= data[k + 1]) {
            return false;
        }
        return true;
    }
    
    public int modeIndex() {
        // GZ replaced 0 with -1
        int modeIndex = -1;
        for (int i = 1; i < data.length - 1; i++) {
            if (isMode(i)) {
                modeIndex = i;
            }
        }
        return modeIndex;
    }
    
    public void printHistogram(int longestBar, char c) throws IOException {
        OutputStream out = new FileOutputStream("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa00/histogram.txt");
        PrintStream p = new PrintStream(out);
        int indexOfMode = modeIndex();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < Math.floor(longestBar / ((double) data[indexOfMode] / data[i])); j++) {
                p.print(c);
            }
            p.println();
        }
        out.close();
    }
}
