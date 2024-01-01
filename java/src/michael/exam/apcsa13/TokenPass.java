package michael.exam.apcsa13;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for (int i = 0; i < board.length; i++) {
            board[i] = (int) (Math.random() * 10) + 1;
        }
        currentPlayer = (int) (Math.random() * board.length);
    }
    
    TokenPass(int[] board, int currentPlayer) {
        this.board = board;
        this.currentPlayer = currentPlayer;
    }

    public int[] getBoard() {
        return board;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void distributeCurrentPlayerTokens() {
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int targetIndex = currentPlayer + 1;
        for (int i = 1; i <= tokens; i++) {
            board[targetIndex % board.length]++;
            targetIndex++;
        }
    }
}
