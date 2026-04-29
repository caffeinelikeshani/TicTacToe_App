import java.util.Scanner;

public class UserInputHandler {
    public static void main(String[] args) {
        int slot = getPlayerInput();
        System.out.println("Selected slot: " + slot);
    }

    public static int getPlayerInput() {
        Scanner scanner = new Scanner(System.in);
        int slot = -1;

        while (slot < 1 || slot > 9) {
            System.out.print("Enter a slot number (1-9): ");
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
        return slot;
    }
}