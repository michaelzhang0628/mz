package michael.exam.apcsa21;

public class ArrayRealizer {
    
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int i = 0; i < array2D[r].length; i++) {
            if (array2D[r][i] == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int numNonZeroRows(int[][] array2D) {
        int row = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                row += 1;
            }
        }
        return row;
    }
    
    public static int[][] resize(int[][] array2D) {
        int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
        int x = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                newArray[x] = array2D[i];
                x++;
            }
        }
        return newArray;
    }
}
