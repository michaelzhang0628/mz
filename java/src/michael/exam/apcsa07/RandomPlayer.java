package michael.exam.apcsa07;

import java.util.ArrayList;

public class RandomPlayer extends Player {
    public RandomPlayer(String name) {
        super(name);
    }
    
    public String getNextMove(GameState state) {
        ArrayList<String> moves = state.getCurrentMoves();
        if (moves.size() == 0) {
            return "no move";
        }
        int index = (int) (Math.random() * moves.size());
        return moves.get(index);
    }
}