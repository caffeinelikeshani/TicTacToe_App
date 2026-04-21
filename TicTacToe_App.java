import java.util.Random;

public class GameSetup {
    public static void main(String[] args) {
        String player1 = "Player 1";
        String player2 = "Player 2";
        
        String currentPlayer;
        String p1Symbol;
        String p2Symbol;

        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = player1;
            p1Symbol = "X";
            p2Symbol = "O";
        } else {
            currentPlayer = player2;
            p1Symbol = "O";
            p2Symbol = "X";
        }

        System.out.println("Toss result: " + currentPlayer + " goes first!");
        System.out.println(player1 + " is " + p1Symbol);
        System.out.println(player2 + " is " + p2Symbol);
    }
}