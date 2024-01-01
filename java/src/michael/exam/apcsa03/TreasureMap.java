package michael.exam.apcsa03;

public class TreasureMap {
    private boolean[][] map;
    
    public TreasureMap(int rows, int cols) {
        super();
        this.map = new boolean[rows][cols];
    }

    public TreasureMap(boolean[][] map) {
        super();
        this.map = map;
    }

    public boolean hasTreasure(int row, int col) {
        if (row < 0 || col < 0 || row >= map.length || col >= map[0].length || map[row][col] != true) {
            return false;
        }
        return true;
    }
    
    public int numAjdacent(int row, int col) {
        int count = 0;
        if (hasTreasure(row - 1, col)) {
            count++;
        }
        if (hasTreasure(row + 1, col)) {
            count++;
        }
        if (hasTreasure(row, col - 1)) {
            count++;
        }
        if (hasTreasure(row, col + 1)) {
            count++;
        }
        if (hasTreasure(row - 1, col - 1)) {
            count++;
        }
        if (hasTreasure(row - 1, col + 1)) {
            count++;
        }
        if (hasTreasure(row + 1, col - 1)) {
            count++;
        }
        if (hasTreasure(row + 1, col + 1)) {
            count++;
        }
        return count;
    }
    
    public int[][] computeCounts() {
        int[][] resultMap = new int[map.length][map[0].length];
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[0].length; col++) {
                if (hasTreasure(row, col)) {
                    resultMap[row][col] = 9;
                } else {
                    resultMap[row][col] = numAjdacent(row, col);
                }
            }
        }
        return resultMap;
        
    }
    
    public int getNumRows() {
        return map.length;
    }
    
    public int getNumCols() {
        return map[0].length;
    }
}
