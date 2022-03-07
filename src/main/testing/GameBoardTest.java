package black_jack_game.testing;

import org.junit.Assert;
import org.junit.Test;

import black_jack_game.GameBoard;

public class GameBoardTest
{
	@Test
	public void testGameBoardConstruct()
	{
		GameBoard board = new GameBoard();
		
		// Test the deck and player hands
		Assert.assertEquals(52, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(0, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(0, board.getPlayer(2).getCurrentHand().size());
	}
	
	@Test
	public void testGameBoardDealCard()
	{
		GameBoard board = new GameBoard();
		
		// Make sure both players hands are empty
		Assert.assertEquals(52, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(0, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(0, board.getPlayer(2).getCurrentHand().size());
		
		// Deal one card to each player
		board.dealCard(1);
		board.dealCard(2);
		
		Assert.assertEquals(50, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(1, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(1, board.getPlayer(2).getCurrentHand().size());
		
		// Deal four cards to each player
		for(int i = 0; i < 4; i++)
		{
			board.dealCard(1);
			board.dealCard(2);
		}
		
		Assert.assertEquals(42, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(5, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(5, board.getPlayer(2).getCurrentHand().size());
	}
	
	@Test
	public void testGameBoardReset()
	{
		GameBoard board = new GameBoard();
		
		// Make sure both players hands are empty
		Assert.assertEquals(52, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(0, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(0, board.getPlayer(2).getCurrentHand().size());
		
		// Deal one card to each player
		board.dealCard(1);
		board.dealCard(2);
		
		Assert.assertEquals(50, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(1, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(1, board.getPlayer(2).getCurrentHand().size());
		
		// Deal four cards to each player
		for(int i = 0; i < 4; i++)
		{
			board.dealCard(1);
			board.dealCard(2);
		}
		
		Assert.assertEquals(42, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(5, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(5, board.getPlayer(2).getCurrentHand().size());
		
		// Reset the gameboard
		board.resetBoard();
		Assert.assertEquals(52, board.getGameBoardDeck().getDeckSize());
		Assert.assertEquals(0, board.getPlayer(1).getCurrentHand().size());
		Assert.assertEquals(0, board.getPlayer(2).getCurrentHand().size());
	}
}
