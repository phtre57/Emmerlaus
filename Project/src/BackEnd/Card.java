package BackEnd;

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
		A,AD,AM,CO,E,S,ST
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
	
	
	/*
	 *  A repenser car il a des carte qui ont plusieurs des.  Et d'autre cartes qui ont exemple 6D12 so... a voirr...
	 * 
	 * */
	private Dice cardDice;
	 



}
