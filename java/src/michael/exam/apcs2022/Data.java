package michael.exam.apcs2022;

public class Data {
    private int MAX;
    private int row;
    private int col;
    private int[][] grid;

    public Data(int mAX, int row, int col) {
        super();
        MAX = mAX;
        grid = new int[row][col];
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] g) {
        grid = g;
    }

    public void repopulate() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int rand = (int) (Math.random() * MAX) + 1;
                while (rand % 10 != 0 || rand % 100 == 0) {
                    rand = (int) (Math.random() * MAX) + 1;
                }
                grid[i][j] = rand;
            }
        }
    }

    public int countIncreasingCols() {
        int increasingCols = 0;
        for (int col = 0; col < grid[0].length; col++) {
            boolean isIncreasing = true;
            for (int row = 1; row < grid.length; row++) {
                if (grid[row - 1][col] > grid[row][col]) {
                    isIncreasing = false;
                }
            }
            if (isIncreasing) {
                increasingCols++;
            }
        }
        return increasingCols;
    }
}
