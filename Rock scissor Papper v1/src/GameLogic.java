public class GameLogic {
        private int maxRounds;
        private int rounds = 0;

        private Player player;

        private Computer computer;



        public GameLogic(int maxRounds,Player player, Computer computer){
            this.maxRounds = maxRounds;
            this.player = player;
            this.computer = computer;
        }

        // start game

    public void start() {

        while(rounds < maxRounds) {
            playRound();
        }

        displayResults();
    }
    // rounds
    private void playRound() {
            Hands userChoose = player.userChoose();
            Hands computerChoose = computer.chooseHand();

        System.out.println(player.getName() + " has " + player.getVictories()+ " victories, chooses " + userChoose);
        System.out.println(computer.getName() + " has " + computer.getVictories()+ " victories, chooses " + computerChoose);



    // if draw repeat

    if (userChoose == computerChoose) {
        playRound();
        return;
    }

    rounds++;



        Player winner = player;
        Computer winnerC = computer;



    switch (userChoose) {
        case PAPER:

            if (computerChoose == Hands.SCISSORS) {
                winnerC = computer;
            }
            else{
                winner = player;
            }
            break;

        case ROCK:
            if (userChoose == Hands.PAPER) {
                winnerC = computer;
            }
            else{
                winner = player;
            }
            break;

        case SCISSORS:
            if (userChoose == Hands.ROCK) {
                winnerC = computer;
            }
            else{
                winner = player;
            }
            break;
    }

        //winner.win();
        winnerC.win();


    }

    private void displayResults() {

        System.out.println("=== GAME END ===");
        System.out.println(player.getName() + " has " + player.getVictories() + " victories");
        System.out.println(computer.getName() + " has " + computer.getVictories() + " victories");

        if (player.getVictories() == computer.getVictories()) {
            System.out.println("THE GAME TIED");
            return;
        }

        System.out.println("WINNER IS : " + (player.getVictories() > computer.getVictories() ? player.getName() : computer.getName()));

    }

}









