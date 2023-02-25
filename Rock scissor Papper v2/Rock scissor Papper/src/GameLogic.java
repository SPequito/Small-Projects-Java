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



    switch (computerChoose) {
        case PAPER:

            if (userChoose == Hands.SCISSORS) {
                winner.winPlayer();

            }

            else {
                winnerC.wincomputer();
            }

            break;

        case ROCK:
            if (userChoose == Hands.PAPER) {
                winner.winPlayer();

            }

            else {
                winnerC.wincomputer();
            }


            break;

        case SCISSORS:
            if (userChoose == Hands.ROCK) {
                winner.winPlayer();

            }

            else {
                winnerC.wincomputer();
            }

            break;
    }



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









