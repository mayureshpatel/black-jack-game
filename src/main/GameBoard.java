package black_jack_game;

import deck.Deck;
import cards.Card;
import java.util.ArrayList;

/**
 * This is a class to represent the playing field. The playing field has players, and a deck of cards
 * 
 * @author Mayuresh
 *
 */
public class GameBoard
{
	// Variables
	private Deck deck;
	private Player player1;
	private Player player2;
	
	// Constructors
	/**
	 * Constructs a game board:
	 * For BlackJack, basically constructs a new deck to play with
	 */
	public GameBoard()
	{
		deck = new Deck();
		player1 = new Player(true);
		player2 = new Player(false);
	}
	
	// Methods
	/**
	 * Returns the deck on this game board
	 * @return the deck
	 */
	public Deck getGameBoardDeck()
	{
		return this.deck;
	}
	
	/**
	 * Resets the deck to play again
	 */
	public void resetBoard()
	{
		ArrayList<Card> temp = new ArrayList<Card>();
		
		// Print out what cards are in each players hands
		//System.out.println("Player1 Hand: " + this.player1.getCurrentHand());
		//System.out.println("Player2 Hand: " + this.player2.getCurrentHand());
		
		// Return all cards from each player back to the deck
		while(player1.getCurrentHand().size() > 0 && player2.getCurrentHand().size() > 0)
		{
			try
			{
				temp.add(player1.getCurrentHand().remove(0));
			}
			catch(NullPointerException e)
			{
				// Don't Worry, Move On
			}
			
			try
			{
				temp.add(player2.getCurrentHand().remove(0));
			}
			catch(NullPointerException e)
			{
				// Don't Worry Move On
			}
		}
		
		// Add all those cards back to the deck
		for(Card c : temp)
		{
			this.deck.getDeck().add(c);
		}
	}
	
	/**
	 * Gets a player from the game
	 * @param playerNumber the player to get
	 * @return the player
	 */
	public Player getPlayer(int playerNumber)
	{
		if(playerNumber == 1)
		{
			return this.player1;
		}
		else
		{
			return this.player2;
		}
	}
	
	/**
	 * Deals a card to a player
	 * @param p the player to deal the card to
	 */
	public Card dealCard(int playerNumber)
	{
		Card dealtCard = this.deck.getDeck().remove(0);
		
		if(playerNumber == 1)
		{
			player1.addCard(dealtCard);
			//System.out.println("Dealt Player1: " + dealtCard);
		}
		else
		{
			player2.addCard(dealtCard);
			//System.out.println("Dealth Player2: " + dealtCard);
		}
		
		return dealtCard;
	}
}
