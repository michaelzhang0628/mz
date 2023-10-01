package michael.exam.apcsa22;

public class Data {
    public static final int MAX = 500;
    private int[][] grid;
    
    public Data(int rows, int cols) {
        this.grid = new int[rows][cols];
    }  

    public int[][] getGrid() {
        return grid;
    }

    /**
     * divisible by 10, but not by 100
     */
    public void repopulate() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int rand = (int) (Math.random() * MAX) + 1;
                while (rand % 10 != 0 || rand % 100 == 0) {
                    rand = (int) (Math.random() * MAX) + 1;
                }
                grid[i][j] = rand;
            }
        }
    }

    public int countIncreasesCols() {
        int count = 0;
        for (int i = 0; i < grid[0].length; i++) {
            boolean ordered = true;
            for (int j = 1; j < grid.length; j++) {
                if (grid[j][i] < grid[j - 1][i]) {
                    ordered = false;
                }
            }
            if (ordered) {
                count++;
            }
        }
        return count;
    }
    
    public static final void main(String[] args) {
        Data d = new Data(4, 3);
        d.repopulate();
        int count = d.countIncreasesCols();
        System.out.println(count);
    }
}
