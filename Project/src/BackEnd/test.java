package BackEnd;

import java.util.ArrayList;

import BackEnd.Card.CancellationValue;
import BackEnd.Card.CardCategory;
import BackEnd.Card.ResistType;

public class test
{
	public static void main(String[] args)
	{
		Dice dice = new Dice(12);
		int number = dice.throwDice();
		System.out.println(number);
		ArrayList<Dice> arraylistDice = new ArrayList<Dice>();
		arraylistDice.add(dice);

		Card card = new Card("Victoire demmer", CardCategory.E,
				ResistType.noResist, null, false, "Win the game",
				arraylistDice);
		ArrayList<Card> hand = new ArrayList<Card>();
		hand.add(card);
		Player player1 = new Player("ZO", 50, hand, hand);
		boolean booleanCard = player1.validateCardsInHands(player1.getCardsInHands());
		System.out.println(booleanCard);
	}
}
