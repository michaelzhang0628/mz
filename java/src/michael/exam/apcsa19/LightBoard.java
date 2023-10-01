package michael.exam.apcsa19;

public class LightBoard {
    protected boolean[][] lights;
    
    protected LightBoard() {
    }

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                double random = Math.random();
                if (random > 0.4) {
                    lights[i][j] = false;
                } else {
                    lights[i][j] = true;
                }                
            }
        }
    }
    
    public boolean evaluateLight(int row, int col) {
        boolean setting = lights[row][col];
        int numOfLightsOn = 0;
        for (int i = 0; i < lights.length; i++) {
            if (lights[i][col]) {
                numOfLightsOn++;
            }
        }
        if (!setting && numOfLightsOn % 3 == 0) {
            setting = true;
        } else if (setting && numOfLightsOn % 2 == 0) {
            setting = false;
        }      
        return setting;
    }
}
