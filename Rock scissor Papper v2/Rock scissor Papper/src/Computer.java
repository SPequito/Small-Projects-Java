public class Computer implements Gamewin {

    private String name;
    private int victories = 0;


    public Computer(String name){
        this.name = name;
    }

    public int getVictories() {
        return victories;
    }

    public String getName() {
        return name;
    }

    public void wincomputer() {
        victories++;

    }

    /*@Override
    public void win() {
        victories++;
    }*/

    public Hands chooseHand() {
        System.out.println(Hands.values()[(int) (Math.random() * Hands.values().length)]);
        return Hands.values()[(int) (Math.random() * Hands.values().length)];
    }

}
