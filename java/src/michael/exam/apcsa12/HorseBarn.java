package michael.exam.apcsa12;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(int spaceNumber) {
        this.spaces = new Horse[spaceNumber];
    }

    HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    public Horse[] getSpaces() {
        return spaces;
    }
    
    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            Horse x = spaces[i];
            if (x != null && name.equals(x.getName()))
                return i;
        }
        return -1;
    }

    public void consolidate() {
        int nextSpace = 0;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null) {
                spaces[nextSpace] = spaces[i];
                if (i != nextSpace) {
                    spaces[i] = null;
                }
                nextSpace++;
            }
        }
    }
}
