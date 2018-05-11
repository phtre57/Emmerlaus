package BackEnd;

public class Player
{

    private String name;
    private int healthPoint;
    private Array<Card> CardsInHands;
    private Array<Card> CardsOnTable;



    public Player(String name, int healthPoint, Array<Card> cardsInHands, Array<Card> cardsOnTable) {
        this.name = name;
        this.healthPoint = healthPoint;
        CardsInHands = cardsInHands;
        CardsOnTable = cardsOnTable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Array<Card> getCardsInHands() {
        return CardsInHands;
    }

    public void setCardsInHands(Array<Card> cardsInHands) {
        CardsInHands = cardsInHands;
    }

    public Array<Card> getCardsOnTable() {
        return CardsOnTable;
    }

    public void setCardsOnTable(Array<Card> cardsOnTable) {
        CardsOnTable = cardsOnTable;
    }


}
