import java.util.Scanner;

public class Player implements Gamewin {

    String user = "";
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    private String name;
    private int victories = 0;


    public Player(String name) {
        this.name = name;
    }

    public int getVictories() {
        return victories;
    }

    public String getName() {
        return name;
    }

    /*public void win() {
        victories++;
    }*/

    @Override
    public void win() {
        victories++;
    }

    public Hands userChoose() {
        user = scanner.nextLine();
        char firstLetter = user.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
            // User has entered a valid input
            switch (firstLetter) {
                case 'R':
                    return Hands.ROCK;
                case 'P':
                    return Hands.PAPER;
                case 'S':
                    return Hands.SCISSORS;
            }
        }

        // User has not entered a valid input. Prompt again.
        return userChoose();

    }
}