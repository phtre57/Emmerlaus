package BackEnd;

import java.util.ArrayList;

public class Player
{

    private String name;
    private int healthPoint;
    private ArrayList<Card> CardsInHands;
    private ArrayList<Card> CardsOnTable;



    public Player(String name, int healthPoint, ArrayList<Card> cardsInHands, ArrayList<Card> cardsOnTable) {
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

    public ArrayList<Card> getCardsInHands() {
        return CardsInHands;
    }

    public void setCardsInHands(ArrayList<Card> cardsInHands) {
        CardsInHands = cardsInHands;
    }

    public ArrayList<Card> getCardsOnTable() {
        return CardsOnTable;
    }

    public void setCardsOnTable(ArrayList<Card> cardsOnTable) {
        CardsOnTable = cardsOnTable;
    }


}
