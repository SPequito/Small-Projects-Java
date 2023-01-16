import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String user = "";
        String computer = "";
        int num;
        Scanner scanner = new Scanner(System.in); // User input
        Random random = new Random(); // random computer choose


        System.out.println("Welcome to rock, paper, and Scissor!"); // welcome title
        System.out.print("Please choose R (Rock), P (Paper), S (Scissor): "); // all user choose

        user = scanner.nextLine(); // user choose

        num = random.nextInt(3);// computer choose
        if (num == 0) {
            computer = "S";
        } else if (num == 1) {
            computer = "R";
        } else if (num == 2) {
            computer = "P";
        }
        // computer print choose
        if (computer.equals("S")) {
            System.out.println("Computer choose Scissor");
        } else if (computer.equals("P")) {
            System.out.println("Computer choose Paper");
        } else if (computer.equals("R")) {
            System.out.println("Computer choose Rock");
        }

        // Determine a computer win

        if (user.equals("R") && computer.equals("P")) {
            System.out.println("Computer win");
        } else if (user.equals("P") && computer.equals("S")) {
            System.out.println("Computer win");
        } else if (user.equals("S") && computer.equals("R")) {
            System.out.println("Computer win");
        }

        // Determine a user win

        if (user.equals("P") && computer.equals("R")) {
            System.out.println("You win");
        } else if (user.equals("S") && computer.equals("P")) {
            System.out.println("You win");
        } else if (user.equals("R") && computer.equals("S")) {
            System.out.println("You win");
        }

        // Determine a Draw

        if (user.equals(computer)) {
            System.out.println("You and Computer Draw");


        }
    }
}