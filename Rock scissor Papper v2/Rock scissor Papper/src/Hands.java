import java.io.Serializable;

public enum Hands implements Serializable {
    ROCK,
    PAPER,
    SCISSORS;

    public String toString(){
        switch(this){
            case ROCK :
                return "Rock";
            case PAPER :
                return "Paper";
            case SCISSORS :
                return "Scissors";
        }
        return null;
    }

}

