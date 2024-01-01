package michael.exam.apcsa07;

public class GameDriver {
    private GameState state;

    public GameDriver(GameState initial) {
        state = initial;
    }

    public void play() {
        System.out.println(state);
        while (!state.isGameOver()) {
            Player player = state.getCurrentPlayer();
            String move = player.getNextMove(state);
            System.out.println(player.getName() + " " + move);
            if (move.equals("no move")) {
                break;
            }
            state.makeMove(move);
        }
        Player winner = state.getWinner();
        if (winner != null) {
            System.out.println(winner.getName() + " wins");
        } else {
            System.out.println("Game ends in a draw");
        }
    }
}
