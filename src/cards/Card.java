package cards;

import deck.Suit;
import deck.Value;

public class Card implements Comparable<Card>
{
	// Instance Variables
	private Suit suit;
	private Value value;
	
	// Constructors
	/**
	 * Constructs a playing card with a given suit and a given value
	 * @param suit the suit
	 * @param value the value
	 */
	public Card(Suit suit, Value value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	// Methods
	/**
	 * Gets the suit of the card
	 * @return the enum suit
	 */
	public Suit getCardSuit()
	{
		return this.suit;
	}

	/**
	 * Gets the value of the card
	 * @return the enum value
	 */
	public Value getCardValue()
	{
		return this.value;
	}
	
	/**
	 * Checks whether or not this card is the same as another card
	 * @param otherCard the other card to compare to
	 * @return true if both cards are of the same suit and value
	 */
	public boolean equals(Card otherCard)
	{
		return this.getCardSuit() == otherCard.getCardSuit() &&
				this.getCardValue() == otherCard.getCardValue();
	}
	
	/**
	 * Checks whether or not two cards are of the same value
	 * @return true if both cards are of the same value
	 */
	public boolean isSameValue(Card otherCard)
	{
		return this.getCardValue() == otherCard.getCardValue();
	}
	
	/**
	 * Checks whether or not two cards are of the same suit
	 * @return
	 */
	public boolean isSameSuit(Card otherCard)
	{
		return this.getCardSuit() == otherCard.getCardSuit();
	}
	
	/**
	 * Returns a string representation of this class
	 */
	public String toString()
	{
		return this.getClass().getName() + ": [" + this.getCardSuit() + ", " + this.getCardValue() + "]";
	}

	@Override
	public int compareTo(Card otherCard)
	{
		if(this.getCardValue().compareTo(otherCard.getCardValue()) < 0)
		{
			return -1;
		}
		else if(this.getCardValue().compareTo(otherCard.getCardValue()) < 0)
		{
			// Compare Suits
			if(this.getCardSuit().compareTo(otherCard.getCardSuit()) < 0)
			{
				return -1;
			}
			else if(this.getCardSuit().compareTo(otherCard.getCardSuit()) == 0)
			{
				return 0;
			}
			else
			{
				return 1;
			}
			
		}
		else
		{
			return 1;
		}
	}
}