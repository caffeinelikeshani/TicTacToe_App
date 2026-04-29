public class GameLoop {
    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        
        boolean gameRunning = true;
        char currentPlayer = 'X';
        int movesMade = 0;

        while (gameRunning) {
            System.out.println("Current turn: " + currentPlayer);
            
            // Logic to get move, validate, and update board would go here
            // Example: updateBoard(board, row, col, currentPlayer);
            movesMade++;

            if (checkWin(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameRunning = false;
            } else if (movesMade == 9) {
                System.out.println("It's a draw!");
                gameRunning = false;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    public static boolean checkWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
               (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }
}