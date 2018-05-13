package BackEnd;

public class Card
{


    static class CancellationValue{
    	 public static final int zero = 0;
    	 public static final int one = 1;
    	 public static final int two = 2;
    }

    
    public enum ResistType{
    	noResist , halfResist , normalResist;
    }
    

    private ResistType resist;
    private CancellationValue Cancellation;
    private boolean isMirror;
    private String cardDescription;
    private Dice cardDice;

    public Card(ResistType resist, boolean isMirror, Dice cardDice, String description){
        this.resist = resist;
        this.isMirror = isMirror;
        this.cardDescription = description;
        this.cardDice = cardDice;
    }


    
}
