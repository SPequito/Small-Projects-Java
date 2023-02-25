import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to rock, paper, and Scissor!"); // welcome to title
        System.out.print("Please choose ROCK, PAPER or SCISSORS: --> "); // all user choose

GameLogic game = new GameLogic(5,new Player("Jasmine"),new Computer("PC"));
game.start();
    }
}