package michael.exam.apcsa19;

public class LightBoardForTesting extends LightBoard {
    public LightBoardForTesting() {
        lights = new boolean[7][5];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                lights[i][j] = false;
            }
        }
        lights[0][0] = true;
        lights[0][1] = true;
        lights[0][3] = true;
        lights[0][4] = true;
        lights[1][0] = true;
        lights[1][3] = true;
        lights[2][0] = true;
        lights[2][3] = true;
        lights[2][4] = true;
        lights[3][0] = true;
        lights[3][4] = true;
        lights[4][0] = true;
        lights[4][4] = true;
        lights[5][0] = true;
        lights[5][1] = true;
        lights[5][3] = true;
        lights[5][4] = true;
    }
}
