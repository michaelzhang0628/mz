package michael.exam.apcsa18;

public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] col = new int[arr2D.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = arr2D[i][c];
        }
        return col;
    }
    
    // Returns true if every value in arr1 appears in arr2
    // Else, returns false
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean contains = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    contains = true;
                }      
            }
            if (!(contains)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isLatin(int[][] square) {
        // check the first row for duplicates
        if (containsDuplicates(square[0])) {
            return false;
        }
        // compare the rest of the rows to the first row
        for (int i = 1; i < square.length; i++) {
            if (!(hasAllValues(square[0], square[i]))) {
                return false;
            }
        }
        // compare all of the columns to the first row
        for (int j = 0; j < square[0].length; j++) {
            if (!(hasAllValues(square[0], getColumn(square, j)))) {
                return false;
            }
        }
        return true;
    }
}

