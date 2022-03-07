package black_jack_game.testing;

import org.junit.Assert;
import org.junit.Test;

import black_jack_game.Player;
import cards.*;
import deck.Suit;

import java.util.ArrayList;
public class PlayerTest
{
	@Test
	public void testPlayerConstruct()
	{
		Player p1 = new Player(false);
		Assert.assertEquals(p1.getCurrentHand().toString(), new ArrayList<Card>().toString());
	}
	
	@Test
	public void testPlayerAddCard()
	{
		Player p1 = new Player(false);
		p1.addCard(new King(Suit.HEARTS));
		p1.addCard(new Two(Suit.SPADES));
		p1.addCard(new Jack(Suit.CLOVERS));
		
		Assert.assertEquals(p1.getCurrentHand().size(), 3);
	}
	
	@Test
	public void testPlayerHand()
	{
		Player p1 = new Player(false);
		p1.addCard(new King(Suit.HEARTS));
		p1.addCard(new Two(Suit.SPADES));
		p1.addCard(new Jack(Suit.CLOVERS));
		
		ArrayList<Card> actual = new ArrayList<Card>();
		actual.add(new King(Suit.HEARTS));
		actual.add(new Two(Suit.SPADES));
		actual.add(new Jack(Suit.CLOVERS));
		
		Assert.assertEquals(p1.getCurrentHand().toString(), actual.toString());
	}
	
	@Test
	public void testPlayerToString()
	{
		Player p1 = new Player(false);
		p1.addCard(new King(Suit.HEARTS));
		p1.addCard(new Two(Suit.SPADES));
		p1.addCard(new Jack(Suit.CLOVERS));
		
		System.out.println(p1.toString());
	}
	
	@Test
	public void testPlayerHandValue1()
	{
		Player p1 = new Player(false);
		p1.addCard(new King(Suit.HEARTS));
		p1.addCard(new Two(Suit.SPADES));
		p1.addCard(new Jack(Suit.CLOVERS));
		
		Assert.assertEquals(22, p1.getTotalHandValue());
	}
	
	@Test
	public void testPlayerHandValue2()
	{
		Player p1 = new Player(false);
		p1.addCard(new Four(Suit.HEARTS));
		p1.addCard(new Two(Suit.SPADES));
		p1.addCard(new Queen(Suit.CLOVERS));
		
		Assert.assertEquals(16, p1.getTotalHandValue());
	}
	
	@Test
	public void testPlayerHandValue3()
	{
		Player p1 = new Player(false);
		p1.addCard(new Three(Suit.HEARTS));
		p1.addCard(new Two(Suit.SPADES));
		p1.addCard(new Five(Suit.CLOVERS));
		
		Assert.assertEquals(10, p1.getTotalHandValue());
	}
	
	@Test
	public void testPlayerHandValue4()
	{
		Player p1 = new Player(false);
		p1.addCard(new Five(Suit.HEARTS));
		p1.addCard(new Six(Suit.SPADES));
		p1.addCard(new Seven(Suit.CLOVERS));
		
		Assert.assertEquals(18, p1.getTotalHandValue());
	}
	
	@Test
	public void testPlayerHandValue5()
	{
		Player p1 = new Player(false);
		p1.addCard(new Eight(Suit.HEARTS));
		p1.addCard(new Nine(Suit.SPADES));
		p1.addCard(new Jack(Suit.CLOVERS));
		
		Assert.assertEquals(27, p1.getTotalHandValue());
	}
	
	@Test
	public void testPlayerHandValue6()
	{
		Player p1 = new Player(false);
		p1.addCard(new Queen(Suit.HEARTS));
		p1.addCard(new Nine(Suit.SPADES));
		p1.addCard(new Ace(Suit.CLOVERS));
		
		Assert.assertEquals(20, p1.getTotalHandValue());
	}
	
	@Test
	public void testPlayerHandValue7()
	{
		Player p1 = new Player(false);
		p1.addCard(new Ace(Suit.HEARTS));
		p1.addCard(new Nine(Suit.SPADES));
		p1.addCard(new Ace(Suit.CLOVERS));
		
		Assert.assertEquals(21, p1.getTotalHandValue());
	}
	
	@Test
	public void testPlayerHandValue8()
	{
		Player p1 = new Player(false);
		p1.addCard(new Ace(Suit.HEARTS));
		p1.addCard(new King(Suit.SPADES));
		p1.addCard(new Ace(Suit.CLOVERS));
		
		Assert.assertEquals(12, p1.getTotalHandValue());
	}
	
//	@Test
//	public void testPlayerHandContainsAce1()
//	{
//		Player p1 = new Player(false);
//		p1.addCard(new Queen(Suit.HEARTS));
//		p1.addCard(new Nine(Suit.SPADES));
//		p1.addCard(new Jack(Suit.CLOVERS));
//		
//		Assert.assertEquals(false, p1.handContainsAce());
//	}
//	
//	@Test
//	public void testPlayerHandContainsAce2()
//	{
//		Player p1 = new Player(false);
//		p1.addCard(new Two(Suit.HEARTS));
//		p1.addCard(new Nine(Suit.SPADES));
//		p1.addCard(new King(Suit.CLOVERS));
//		
//		Assert.assertEquals(false, p1.handContainsAce());
//		
//		p1.addCard(new Ace(Suit.SPADES));
//		
//		Assert.assertEquals(true, p1.handContainsAce());
//	}
//	
//	@Test
//	public void testPlayerHandContainsAce3()
//	{
//		Player p1 = new Player(false);
//		p1.addCard(new Two(Suit.HEARTS));
//		p1.addCard(new Eight(Suit.SPADES));
//		p1.addCard(new King(Suit.CLOVERS));
//		
//		Assert.assertEquals(false, p1.handContainsAce());
//	}
//	
//	@Test
//	public void testPlayerHandContainsAce4()
//	{
//		Player p1 = new Player(false);
//		p1.addCard(new Two(Suit.HEARTS));
//		p1.addCard(new Eight(Suit.SPADES));
//		p1.addCard(new King(Suit.CLOVERS));
//		p1.addCard(new Seven(Suit.SPADES));
//		p1.addCard(new Ace(Suit.DIAMONDS));
//		
//		Assert.assertEquals(true, p1.handContainsAce());
//	}
	
//	@Test
//	public void testPlayerSortCards1()
//	{
//		Player p1 = new Player(false);
//		p1.addCard(new Jack(Suit.DIAMONDS));
//		p1.addCard(new Three(Suit.HEARTS));
//		p1.addCard(new Ace(Suit.HEARTS));
//		
//		// Expected
//		Player p2 = new Player(false);
//		p2.addCard(new Jack(Suit.DIAMONDS));
//		p2.addCard(new Three(Suit.HEARTS));
//		p2.addCard(new Ace(Suit.HEARTS));
//		
//		// Sort the first players hand
//		p1.putAcesToTheEnd();
//		
//		// Assert
//		Assert.assertEquals(p2.toString(), p1.toString());
//	}
	
//	@Test
//	public void testPlayerSortCards2()
//	{
//		Player p1 = new Player(false);
//		p1.addCard(new Jack(Suit.DIAMONDS));
//		p1.addCard(new Three(Suit.HEARTS));
//		p1.addCard(new Ace(Suit.SPADES));
//		p1.addCard(new Ace(Suit.DIAMONDS));
//		p1.addCard(new Six(Suit.HEARTS));
//		p1.addCard(new Two(Suit.HEARTS));
//		
//		// Expected
//		Player p2 = new Player(false);
//		p2.addCard(new Jack(Suit.DIAMONDS));
//		p2.addCard(new Six(Suit.HEARTS));
//		p2.addCard(new Three(Suit.HEARTS));
//		p2.addCard(new Two(Suit.HEARTS));
//		p2.addCard(new Ace(Suit.SPADES));
//		p2.addCard(new Ace(Suit.DIAMONDS));
//		
//		// Sort the first players hand
//		p1.putAcesToTheEnd();
//		
//		// Assert
//		System.out.println("Player1 Sorted: " + p1.toString());
//		System.out.println("Player2 Sorted: " + p2.toString());
//		Assert.assertEquals(p2.toString(), p1.toString());
//	}
	
	@Test
	public void testPlayerFormattedPrint()
	{
		Player p1 = new Player(false);
		p1.addCard(new Jack(Suit.HEARTS));
		p1.addCard(new King(Suit.CLOVERS));
		p1.addCard(new Ace(Suit.DIAMONDS));
		p1.addCard(new Nine(Suit.HEARTS));
		p1.addCard(new Six(Suit.SPADES));
		p1.addCard(new Two(Suit.SPADES));
		p1.addCard(new Four(Suit.CLOVERS));
		
		p1.removeCard(3);
		
		System.out.println(p1.printPlayerHand(1));
	}
}
