package michael.exam.apcsa09;

public class NumberCube {
    public int toss() {
        return (int) (Math.random() * 6 + 1);
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] tosses = new int[numTosses];
        for (int i = 0; i < tosses.length; i++) {
            tosses[i] = cube.toss();
        }
        return tosses;
    }

    public static int getLongestRun(int[] values) {
        int inARow = 1;
        int maxInARow = 1;
        int startOfMaxInARow = -1;
        for (int i = values.length - 2; i >= 0; i--) {
            if (values[i] == values[i + 1]) {
                inARow++;
                if (inARow > maxInARow) {
                    maxInARow = inARow;
                    startOfMaxInARow = i;
                }
            } else {
                inARow = 1;
            }
        }
        return startOfMaxInARow;
    }
}
