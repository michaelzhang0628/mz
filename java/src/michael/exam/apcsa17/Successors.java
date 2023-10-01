package michael.exam.apcsa17;

public class Successors {
    public static Position findPosition(int num, int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (intArr[i][j] == num) {
                    return new Position(i, j);
                }
            }
        }                         
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] successors = new Position[intArr.length][intArr[0].length];
        for(int i = 0; i < successors.length; i++) {
            for(int j = 0; j < successors[0].length; j++) {
                successors[i][j] = findPosition(intArr[i][j] + 1, intArr);
            }
        }
        return successors;
    }
}
