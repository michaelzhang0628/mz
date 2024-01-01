package michael.exam.apcsa99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Quilt {
    private int rowOfBlock;
    private int colOfBlock;
    private char[][] block;

    public Quilt(InputStream in, int rowOfBlock, int colOfBlock) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] nums = reader.readLine().split(" ");
        int row = Integer.parseInt(nums[0]);
        int col = Integer.parseInt(nums[1]);
        this.block = new char[row][col];
        for (int i = 0; i < row; i++) {
            String pattern = reader.readLine();
            for (int j = 0; j < col; j++) {
                this.block[i][j] = pattern.charAt(j);
            }
        }
        in.close();
        this.rowOfBlock = rowOfBlock;
        this.colOfBlock = colOfBlock;
    }

    public char[][] getBlock() {
        return block;
    }

    public void placeBlock(int startRow, int startCol, char[][] qmat) {
        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[0].length; j++) {
                qmat[startRow + i][startCol + j] = block[i][j];
            }
        }
    }
    
    public void placeFlipped(int startRow, int startCol, char[][] qmat) {
        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[0].length; j++) {
                qmat[startRow + i][startCol + j] = block[block.length - i - 1][block[0].length - j - 1];
            }
        }
    }
    
    public char[][] quiltToMat() {
        boolean isNotFlipped = true;
        char[][] quilt = new char[block.length * rowOfBlock][block[0].length * colOfBlock];
        for (int i = 0; i < rowOfBlock; i++) {
            for (int j = 0; j < colOfBlock; j++) {
                if (isNotFlipped) {
                    placeBlock(i * block.length, j * block[0].length, quilt);
                } else {
                    placeFlipped(i * block.length, j * block[0].length, quilt);
                }
                isNotFlipped = !isNotFlipped;
            }
        }
        return quilt;
    }
}
