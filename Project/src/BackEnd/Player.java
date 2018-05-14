package BackEnd;

import java.util.ArrayList;

public class Player
{

	public final static int PLAYERS_NAME_LENGTH_MIN = 3;
	public final static int PLAYERS_NAME_LENGTH_MAX = 20;
	public final static int PLAYERS_HEALTH_POINT = 50;

	private String name;
	private int healthPoint;
	private ArrayList<Card> CardsInHands;
	private ArrayList<Card> CardsOnTable;

	public Player(String name, int healthPoint, ArrayList<Card> cardsInHands,
			ArrayList<Card> cardsOnTable)
	{
		this.name = name;
		this.healthPoint = healthPoint;
		CardsInHands = cardsInHands;
		CardsOnTable = cardsOnTable;
	}

	/**
	 * Get Player's name
	 * @return player's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * 
	 * Set name value for a player
	 * 
	 * @param String name Player's Name
	 */
	public void setName(String name)
	{
		if (validateName(name))
		{
			this.name = name;
		}
	}

	/**
	 * Validate the player's name.
	 * 
	 * @param name Player's name
	 * @return  boolean true if the player's name is correct is validate. False if the
	 *         player's name is not validate.
	 * 
	 */
	public boolean validateName(String name)
	{
		boolean validateName = false;
		int nameLength = name.length();
		if (name != null && nameLength >= PLAYERS_NAME_LENGTH_MIN
				&& nameLength <= PLAYERS_NAME_LENGTH_MAX)
		{
			validateName = true;
		}
		return validateName;
	}

	/**
	 * get player's health points
	 * @return int player's health point
	 */
	public int getHealthPoint()
	{
		return healthPoint;
	}

	
	public void setHealthPoint(int healthPoint)
	{
		if (validateHealthPoint(healthPoint))
		{
			this.healthPoint = healthPoint;
		}

	}

	/**
	 * Validate Player's Health Point 
	 * 
	 * @param healthPoint Player's life points
	 * @return boolean true if health point is validate.
	 */
	public boolean validateHealthPoint(int healthPoint)
	{
		boolean validateHealthPoint = false;
		if(healthPoint == PLAYERS_HEALTH_POINT)
		{
			validateHealthPoint = true;
		}
		
		return validateHealthPoint;
	}

	public ArrayList<Card> getCardsInHands()
	{
		return CardsInHands;
	}

	public void setCardsInHands(ArrayList<Card> cardsInHands)
	{
		CardsInHands = cardsInHands;
	}

	public ArrayList<Card> getCardsOnTable()
	{
		return CardsOnTable;
	}

	public void setCardsOnTable(ArrayList<Card> cardsOnTable)
	{
		CardsOnTable = cardsOnTable;
	}

}
