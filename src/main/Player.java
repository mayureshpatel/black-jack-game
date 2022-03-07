package black_jack_game;

import cards.*;
import deck.Suit;
import deck.Value;

import java.util.ArrayList;
import java.util.Collections;

public class Player
{
	// Variables
	private ArrayList<Card> currentHand;
	private boolean isDealer;
	
	// Constructors
	/**
	 * Constructs a player
	 * @param isDealer whether this player is a dealer
	 */
	public Player(boolean isDealer)
	{
		currentHand = new ArrayList<Card>();
		this.isDealer = isDealer;
	}
	
	// Methods
	/**
	 * Gets the array list representation of the current hand for this player
	 * @return list of cards in this players hand
	 */
	public ArrayList<Card> getCurrentHand()
	{
		return this.currentHand;
	}
	
	public boolean getIsDealer()
	{
		return this.isDealer;
	}
	
	/**
	 * Adds a card to this players hand
	 * @param newCard the new card added
	 */
	public void addCard(Card newCard)
	{
		currentHand.add(newCard);
	}
	
	/**
	 * Removes a card from the hand, given the  index, and returns it
	 * @param index the index of the card array to remove the card from
	 * @return the card that was removed
	 */
	public Card removeCard(int index)
	{
		return this.currentHand.remove(index);
	}
	
	/**
	 * Removes a card given a card object
	 * @param c the card to be removed
	 * @return true if the card was removed, otherwise false
	 */
	public boolean removeCard(Card c)
	{
		if(this.currentHand.contains(c))
		{
			this.currentHand.remove(c);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Gets the numerical value of the cards in this players hand
	 * @return the total numerical value of the cards
	 */
	public int getTotalHandValue()
	{
		// Sort the hand so that aces are at the end (useful for blackjack)
		putAcesToTheEnd();
		
		int totalValue = 0;
		for(Card c : currentHand)
		{
			switch(c.getCardValue())
			{
				case ACE:			// Evaluate Aces Last so that you know whether to apply 1 or 11
					if(totalValue < 10)
					{
						totalValue += 11;
					}
					else
					{
						totalValue += 1;
					}
					break;
				case TWO:
					totalValue += 2;
					break;
				
				case THREE:
					totalValue += 3;
					break;
					
				case FOUR:
					totalValue += 4;
					break;
					
				case FIVE:
					totalValue += 5;
					break;
					
				case SIX:
					totalValue += 6;
					break;
					
				case SEVEN:
					totalValue += 7;
					break;
				
				case EIGHT:
					totalValue += 8;
					break;
					
				case NINE:
					totalValue += 9;
					break;
					
				case TEN:
					totalValue += 10;
					break;
					
				case JACK:
					totalValue += 10;
					break;
					
				case QUEEN:
					totalValue += 10;
					break;
					
				case KING:
					totalValue += 10;
					break;
			}
		}
		
		return totalValue;
	}
	
	/**
	 * Checks whether or not the player has an Ace
	 * @return true if the player has an Ace
	 */
	private boolean handContainsAce()
	{
		for(Card c : this.currentHand)
		{
			if(c.getCardValue() == Value.ACE)
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets Aces to be sent to the end of the list
	 */
	private void putAcesToTheEnd()
	{
		// If there are no aces in the hand, no need to do anything
		if(!handContainsAce())
		{
			return;
		}
		else
		{
			Collections.sort(this.currentHand);
		}
	}
	
	/**
	 * Gets the string representation of the cards in this players hand
	 * @return string representation of hand
	 */
	public String printPlayerHand(int size)
	{
		StringBuilder s = new StringBuilder();
		
		if(size == 1)
		{
			for(Card c : this.currentHand)
			{
				s.append(String.format("[%s, %s]", c.getCardSuit(), c.getCardValue()));
			}
		}
		else
		{
			for(Suit suit : Suit.values())
			{
				s.append(printPlayerHandHelper(suit));
				if(suit != Suit.DIAMONDS)
				{
					s.append("\n");
				}
			}
		}
		
		return s.toString();
	}
	
	/**
	 * Helper method for printing out the cards in the players hand
	 * @param suit the suit
	 * @return string representation of the cards of a single suit in the players hand
	 */
	private StringBuilder printPlayerHandHelper(Suit suit)
	{
		StringBuilder s = new StringBuilder();
		s.append(String.format("%10s : ", suit.name()));
		for(Card c : this.currentHand)
		{
			if(c.getCardSuit() == suit)
			{
				s.append("[" + c.getCardValue() + "]");
			}
		}
		
		return s;
	}
	
	/**
	 * Gets the string representation of this player
	 */
	public String toString()
	{
		return this.getClass().getName() + ": [" + isDealer + "][" + currentHand.toString() + "]";
	}
}
