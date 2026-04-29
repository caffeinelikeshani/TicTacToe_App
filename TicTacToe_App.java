public class DrawDetector {
    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'X', 'O'},
            {'O', 'X', 'O'}
        };

        if (checkDraw(board)) {
            System.out.println("The game is a draw!");
        } else {
            System.out.println("The game is still in progress.");
        }
    }
}