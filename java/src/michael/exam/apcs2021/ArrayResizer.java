package michael.exam.apcs2021;

public class ArrayResizer {
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int c = 0; c < array2D[0].length; c++) {
            if (array2D[r][c] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int numRowsOfNonZero = 0;
        for (int r = 0; r < array2D.length; r++) {
            boolean hasZero = false;
            for (int c = 0; c < array2D[0].length; c++) {
                if (array2D[r][c] == 0) {
                    hasZero = true;
                }
            }
            if (!hasZero) {
                numRowsOfNonZero++;
            }
        }
        return numRowsOfNonZero;
    }

    public static int[][] resize(int[][] array2D) {
        int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
        int newRow = 0;
        for (int oldRow = 0; oldRow < array2D.length; oldRow++) {
            if (isNonZeroRow(array2D, oldRow)) {
                newArray[newRow] = array2D[oldRow];
                newRow++;
            }
        }
        return newArray;
    }
}
