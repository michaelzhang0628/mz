package michael.exam.apcsa17;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        digitList.add(0, num % 10);
        int numRemaining = num / 10;
        while (numRemaining > 0) {
            digitList.add(0, numRemaining % 10);
            numRemaining /= 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        if (digitList.size() > 1) {
            for (int i = 0; i < digitList.size() - 1; i++) {
                if (digitList.get(i).compareTo(digitList.get(i + 1)) >= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
