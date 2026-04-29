public class MoveValidator {
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        
        return board[row][col] == '-';
    }

    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', 'X', '-'},
            {'-', '-', '-'}
        };

        int testRow = 1;
        int testCol = 1;

        if (isValidMove(board, testRow, testCol)) {
            System.out.println("Move is valid.");
        } else {
            System.out.println("Move is invalid.");
        }
    }
}