package BackEnd;

import java.util.ArrayList;

public class Card
{

	static class CancellationValue
	{
		public static final int zero = 0;
		public static final int one = 1;
		public static final int two = 2;
	}

	public enum ResistType
	{
		noResist, halfResist, normalResist;
	}

	public enum CardCategory
	{
		A, AD, AM, CO, E, S, ST
	}

	/**
	 * Card's name (title)
	 */
	private String name;
	/**
	 * Card's Category
	 */
	private CardCategory category;
	/**
	 * card's resist type
	 */
	private ResistType resist;
	/**
	 * card's cancellation Value
	 */
	private CancellationValue Cancellation;
	/**
	 * boolean - true : card can be mirror. False : card can't be mirror.
	 */
	private boolean isMirror;
	/**
	 * Card's description. It's the explanation text on the card.
	 */
	private String cardDescription;

	/**
	 * Array of dice for damage,healing,etc.
	 */
	private ArrayList<Dice> cardDice;

	public Card(String name, CardCategory category, ResistType resist,
			CancellationValue cancellation, boolean isMirror,
			String cardDescription, ArrayList<Dice> cardDice)
	{
		super();
		this.name = name;
		this.category = category;
		this.resist = resist;
		Cancellation = cancellation;
		this.isMirror = isMirror;
		this.cardDescription = cardDescription;
		this.cardDice = cardDice;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public CardCategory getCategory()
	{
		return category;
	}

	public void setCategory(CardCategory category)
	{
		this.category = category;
	}

	public ResistType getResist()
	{
		return resist;
	}

	public void setResist(ResistType resist)
	{
		this.resist = resist;
	}

	public CancellationValue getCancellation()
	{
		return Cancellation;
	}

	public void setCancellation(CancellationValue cancellation)
	{
		Cancellation = cancellation;
	}

	public boolean isMirror()
	{
		return isMirror;
	}

	public void setMirror(boolean isMirror)
	{
		this.isMirror = isMirror;
	}

	public String getCardDescription()
	{
		return cardDescription;
	}

	public void setCardDescription(String cardDescription)
	{
		this.cardDescription = cardDescription;
	}

	public ArrayList<Dice> getCardDice()
	{
		return cardDice;
	}

	public void setCardDice(ArrayList<Dice> cardDice)
	{
		this.cardDice = cardDice;
	}

}
