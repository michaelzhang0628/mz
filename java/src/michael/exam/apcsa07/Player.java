package michael.exam.apcsa07;

public class Player {
    private String name;
    
    public Player(String aName) {
        name = aName;
    }
    
    public String getName() {
        return name;
    }
    
    public String getNextMove(GameState state) {
        return "no move";
    }
}
