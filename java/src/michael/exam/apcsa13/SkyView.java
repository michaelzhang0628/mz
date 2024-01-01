package michael.exam.apcsa13;

import java.util.Arrays;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int scannedIndex = 0;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                // checks if row is even
                if (row % 2 == 0) {
                    view[row][col] = scanned[scannedIndex];
                // does this if row is odd
                } else {
                    view[row][numCols - col - 1] = scanned[scannedIndex];
                }
                scannedIndex++;
            }
        }
    }

    public double[][] getView() {
        return view;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int count = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
                count++;
            }
        }
        return sum / count;
    }
}
