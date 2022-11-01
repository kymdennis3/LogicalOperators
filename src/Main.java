import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Logical operators = used to connect two or more expressions
             && = (AND) both conditions must be true
             || = (OR) Either condition must be true
             ! = (NOT) reverses boolean value of a condition
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game");

        String input = scanner.nextLine();

        if (!input.equals("q") && !input.equals("Q")) {
            System.out.println("You are still playing the game");
        }
        else {
            System.out.println("You have exited the game");
        }

    }
}