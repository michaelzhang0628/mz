package michael.exam.apcsa07;

public class SelfDivisor {
    public static boolean isSelfDivisor(int number) {
        if (number == 0) {
            return false;
        }
        int numRemaining = number;
        while (numRemaining > 0) {
            int digit = numRemaining % 10;
            if (digit == 0 || number % digit != 0) {
                return false;
            }
            numRemaining /= 10;
        }
        return true;
    }

    public static int[] firstNumSelfDivisors(int start, int num) {
        int[] selfDivisors = new int[num];
        int possible = start;
        int i = 0;
        while (i < selfDivisors.length) {
            if (isSelfDivisor(possible)) {
                selfDivisors[i] = possible;
                i++;
            }
            possible++;
        }
        return selfDivisors;
    }
}
