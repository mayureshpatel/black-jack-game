package black_jack_game;

import java.util.Scanner;

public class Game
{
	// Variables
	private GameBoard board;
	private boolean isDone;
	private boolean isBusted, isBlackJack;
	private String winner;
	
	// Constructors
	/**
	 * Constructs a BlackJack game to be played by constructing a playing field
	 */
	public Game()
	{
		board = new GameBoard();
	}
	
	// Methods
	/**
	 * Main loop to run the game
	 */
	public void run()
	{
		Scanner in = new Scanner(System.in);
		
		// Display a greeting message
		System.out.println(displayGreeting());
		
		// Shuffle the deck and deal Two Cards to Each Player
		dealInitialCards();
		
		// Show the initial hands and their values
		System.out.println(displayPlayerInformation(true));
		
		// Check for BlackJack in-case either player wins in initial deal
		checkBlackJackCondition();
		
		// Ask the player if they want to hit
		while(!isDone)
		{
			// Get player input and process it
			String playerInput = getPlayerInput(in);
			hitOrStay(playerInput);
			
			// Check to see if player has busted or not
			checkBustCondition();
		}
		
		// Check final win Condition
		checkFinalWinCondition();
		
		// Print out who won
		System.out.println(this.winner);
		
		in.close();
	}
	
	private String displayGreeting()
	{
		StringBuilder s = new StringBuilder();
		s.append(String.format("%62s", "Welcome To BlackJack!\n\n"));
		return s.toString();
	}
	
	private StringBuilder displayPlayerInformation(boolean showDealerHand)
	{
		StringBuilder s = new StringBuilder();
		s.append(printBorder() + "\n");
		
		// Player Information (Player Name and the cards they hold)
		s.append(String.format("%s: %10s:", "Showing Current Hands", "Dealer"));
		if(showDealerHand)
		{
			s.append(String.format("%s[%d]", board.getPlayer(1).printPlayerHand(1), board.getPlayer(1).getTotalHandValue()));
			
		}
		else
		{
			s.append(String.format("%s", "[hidden]"));
		}
		s.append(String.format("\n%34s:%1s[%d]", "Player1", board.getPlayer(2).printPlayerHand(1), board.getPlayer(2).getTotalHandValue()));
		
		//s.append("\n" + printBorder() + "\n");
		return s;
	}
	
	private String printBorder()
	{
		StringBuilder s = new StringBuilder();
		s.append("============================================================================================");
		return s.toString();
	}
	
	private void dealInitialCards()
	{
		// Shuffle the deck first, then deal two cards each
		board.getGameBoardDeck().shuffleDeck();
		for(int i = 0; i < 2; i++)
		{
			board.dealCard(1);
			board.dealCard(2);
		}
	}
	
	private String getPlayerInput(Scanner in)
	{
		System.out.print("\nWould You Like to Hit(y) or Stay(n)?: ");
		return in.next();
	}
	
	private void hitOrStay(String decision)
	{
		// Player wants to hit
		if(decision.equals("y"))
		{
			board.dealCard(2);
			System.out.println(displayPlayerInformation(true));
		}
		// Player wants to stay
		else
		{
			this.isDone = true;
		}
	}
	
	private void checkBlackJackCondition()
	{
		int dealerHand = board.getPlayer(1).getTotalHandValue();
		int playerHand = board.getPlayer(2).getTotalHandValue();
		if(dealerHand == 21 || playerHand == 21)
		{
			this.isDone = true;
			this.isBlackJack = true;
			if(dealerHand == 21 && playerHand == 21)
			{
				this.winner = "Dealer Wins!";
			}
			else if(dealerHand == 21)
			{
				this.winner = "Dealer Wins!";
			}
			else
			{
				this.winner = "Player Wins!";
			}
			
		}
	}
	
	private void checkBustCondition()
	{
		int dealerHand = board.getPlayer(1).getTotalHandValue();
		int playerHand = board.getPlayer(2).getTotalHandValue();
		if(dealerHand > 21 || playerHand > 21)
		{
			this.isDone = true;
			this.isBusted = true;
			if(dealerHand > 21)
			{
				this.winner = "Player Wins!";
			}
			else if(playerHand > 21)
			{
				this.winner = "Dealer Wins!";
			}
		}
	}
	
	private void checkFinalWinCondition()
	{
		int dealerHand = board.getPlayer(1).getTotalHandValue();
		int playerHand = board.getPlayer(2).getTotalHandValue();
		if(this.isBusted == true)
		{
			// Do Nothing
		}
		else if(this.isBlackJack == true)
		{
			// Do Nothing
		}
		else if(dealerHand >= playerHand)
		{
			this.winner = "Dealer Wins!";
		}
		else
		{
			this.winner = "Player Wins!";
		}
	}
}
