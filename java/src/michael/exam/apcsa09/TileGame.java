package michael.exam.apcsa09;

import java.util.ArrayList;

public class TileGame {
    private ArrayList<NumberTile> board;

    public TileGame() {
        board = new ArrayList<NumberTile>();
    }
    
    public ArrayList<NumberTile> getBoard() {
        return board;
    }

    public void addTile(NumberTile tile) {
        board.add(tile);
    }

    int getIndexForFit(NumberTile tile) {
        if (board.size() == 0 || tile.getRight() == board.get(0).getLeft()) {
            return 0;
        }
        if (tile.getLeft() == board.get(board.size() - 1).getRight()) {
            return board.size();
        }
        for (int i = 1; i < board.size(); i++) {
            if (board.get(i - 1).getRight() == tile.getLeft() && board.get(i).getLeft() == tile.getRight()) {
                return i;
            }
        }
        return -1;
    }

    public boolean insertTile(NumberTile tile) {
        for (int r = 0; r < 4; r++) {
            int index = getIndexForFit(tile);
            if (index != -1) {
                board.add(index, tile);
                return true;
            }
            tile.rotate();
        }
        return false;
    }
}
