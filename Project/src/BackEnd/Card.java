package BackEnd;

public class Card
{

    public  enum Dice {
        4,6,8,12,20,100
    }
    
    public enum CancellationValue{
    	 0,1,2
    }
    
    public enum ResistType{
    	"noResist" , "halfResist" , "normalResist"
    }
    

    private ResistType Resist;
    private CancellationValue Cancellation;
    private boolean isMirror;
    private Dice dice;
    private String cardDescription;
    
}
