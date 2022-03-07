package deck.testing;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import cards.*;
import deck.Deck;
import deck.Suit;

public class DeckTesting
{
	@Test
	public void testDeckConstructor()
	{
		Deck d = new Deck();		// A deck is constructed within the constructor of the deck class
		Assert.assertEquals(d.getDeckSize(), 52);
	}
	
	@Test
	public void testDeckSuitCheck()
	{
		Deck d = new Deck();
		Assert.assertEquals(d.getDeckSize(), 52);
		Assert.assertEquals(d.numCardsInSuit(Suit.HEARTS), 13);
		Assert.assertEquals(d.numCardsInSuit(Suit.CLOVERS), 13);
		Assert.assertEquals(d.numCardsInSuit(Suit.DIAMONDS), 13);
		Assert.assertEquals(d.numCardsInSuit(Suit.SPADES), 13);
	}
	
	@Test
	public void testDeckShuffle()
	{
		Deck d = new Deck();
		
		ArrayList<Card> initialDeck = new ArrayList<Card>();
		for(Suit s : Suit.values())
		{
			initialDeck.add(new Ace(s));
			initialDeck.add(new Two(s));
			initialDeck.add(new Three(s));
			initialDeck.add(new Four(s));
			initialDeck.add(new Five(s));
			initialDeck.add(new Six(s));
			initialDeck.add(new Seven(s));
			initialDeck.add(new Eight(s));
			initialDeck.add(new Nine(s));
			initialDeck.add(new Ten(s));
			initialDeck.add(new Jack(s));
			initialDeck.add(new Queen(s));
			initialDeck.add(new King(s));
		}
		System.out.println(d.getDeck());
		System.out.println(initialDeck);
		Assert.assertEquals(d.getDeck().toString(), initialDeck.toString());
		
		d.shuffleDeck();
		System.out.println("\n\nInitial Deck\n" + initialDeck);
		System.out.println("\nShuffled Deck\n" + d.getDeck());
		Assert.assertNotEquals(initialDeck, d.getDeck());
	}
	
//	@Test
//	public void testDeckDeal()
//	{
//		Deck d = new Deck();
//		
//		Card c = d.dealCard();
//		Assert.assertEquals(Suit.SPADES, c.getCardSuit());
//		Assert.assertEquals(Value.ACE, c.getCardValue());
//		
//		c = d.dealCard();
//		Assert.assertEquals(Suit.SPADES, c.getCardSuit());
//		Assert.assertEquals(Value.TWO, c.getCardValue());
//		
//	}
	
	@Test
	public void testDeckPrinter1()
	{
		Deck d = new Deck();
		System.out.println(d.printAllCards());
	}
	
	@Test
	public void testDeckPrinter2()
	{
		Deck d = new Deck();
		d.getDeck().remove(12);
		d.getDeck().remove(29);
		
		System.out.println(d.printAllCards());
	}
}
