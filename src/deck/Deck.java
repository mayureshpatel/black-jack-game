package deck;

import cards.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	// Instance Variables
	ArrayList<Card> deck;
	
	// Constructors
	/**
	 * Constructs a deck of cards by initializing a brand new deck
	 */
	public Deck()
	{
		deck = new ArrayList<Card>();
		constructDeckHelper();
	}
	
	// Methods
	/**
	 * A helper method to construct a new deck
	 */
	private void constructDeckHelper()
	{
		for(Suit currentSuit : Suit.values())
		{
			deck.add(new Ace(currentSuit));
			deck.add(new Two(currentSuit));
			deck.add(new Three(currentSuit));
			deck.add(new Four(currentSuit));
			deck.add(new Five(currentSuit));
			deck.add(new Six(currentSuit));
			deck.add(new Seven(currentSuit));
			deck.add(new Eight(currentSuit));
			deck.add(new Nine(currentSuit));
			deck.add(new Ten(currentSuit));
			deck.add(new Jack(currentSuit));
			deck.add(new Queen(currentSuit));
			deck.add(new King(currentSuit));
		}
	}
	
	/**
	 * Counts the number of cards that are in the deck of a given suit. At initialization, each suit should return 13.
	 * @param suit the suit
	 * @return the number of cards belonging to the suit in the deck
	 */
	public int numCardsInSuit(Suit suit)
	{
		int count = 0;
		for(Card c : deck)
		{
			if(c.getCardSuit() == suit)
			{
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * Shuffles the deck
	 */
	public void shuffleDeck()
	{
		Collections.shuffle(this.deck);
	}
	
	/**
	 * Gets the number of cards in the deck
	 * @return the number of cards in the deck
	 */
	public int getDeckSize()
	{
		return this.deck.size();
	}
	
	/**
	 * Gets a reader-friendly string representation of the deck
	 * @return string that represents this deck
	 */
	public String printAllCards()
	{
		String s = "";
		for(Suit suit : Suit.values())
		{
			s += getAllHelper(suit);
			
			if(suit != Suit.DIAMONDS)
			{
				s += "\n";
			}
		}
		return s;
	}
	
	/**
	 * Helper method to print out a formatted list of all the cards in the deck
	 * @param suit the suit
	 * @return a string representing all cards in the deck in a given suit
	 */
	private String getAllHelper(Suit suit)
	{
		String s = String.format("%10s: ", suit.name());
		for(Card c : this.deck)
		{
			if(c.getCardSuit() == suit)
			{
				s += "[" + c.getCardValue() + "]";
			}
		}
		return s;
	}
	
	/**
	 * Gets the deck list
	 * @return the deck of cards
	 */
	public ArrayList<Card> getDeck()
	{
		return this.deck;
	}
}
