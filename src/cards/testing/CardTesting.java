package cards.testing;

import org.junit.Assert;
import org.junit.Test;

import cards.*;
import deck.*;

public class CardTesting
{
	@Test
	public void testAce()
	{
		Ace a1 = new Ace(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.ACE);
	}
	
	@Test
	public void testAceSuits()
	{
		Card a1 = new Ace(Suit.CLOVERS);
		Card a2 = new Ace(Suit.DIAMONDS);
		Card a3 = new Ace(Suit.HEARTS);
		Card a4 = new Ace(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.ACE);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testTwo()
	{
		Two a1 = new Two(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.TWO);
	}
	
	@Test
	public void testTwoSuits()
	{
		Card a1 = new Two(Suit.CLOVERS);
		Card a2 = new Two(Suit.DIAMONDS);
		Card a3 = new Two(Suit.HEARTS);
		Card a4 = new Two(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.TWO);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testThree()
	{
		Card a1 = new Three(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.THREE);
	}
	
	@Test
	public void testThreeSuits()
	{
		Card a1 = new Three(Suit.CLOVERS);
		Card a2 = new Three(Suit.DIAMONDS);
		Card a3 = new Three(Suit.HEARTS);
		Card a4 = new Three(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.THREE);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testFour()
	{
		Card a1 = new Four(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.FOUR);
	}
	
	@Test
	public void testFourSuits()
	{
		Card a1 = new Four(Suit.CLOVERS);
		Card a2 = new Four(Suit.DIAMONDS);
		Card a3 = new Four(Suit.HEARTS);
		Card a4 = new Four(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.FOUR);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testFive()
	{
		Card a1 = new Five(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.FIVE);
	}
	
	@Test
	public void testFiveSuits()
	{
		Card a1 = new Five(Suit.CLOVERS);
		Card a2 = new Five(Suit.DIAMONDS);
		Card a3 = new Five(Suit.HEARTS);
		Card a4 = new Five(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.FIVE);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testSix()
	{
		Card a1 = new Six(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.SIX);
	}
	
	@Test
	public void testSixSuits()
	{
		Card a1 = new Six(Suit.CLOVERS);
		Card a2 = new Six(Suit.DIAMONDS);
		Card a3 = new Six(Suit.HEARTS);
		Card a4 = new Six(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.SIX);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testSeven()
	{
		Card a1 = new Seven(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.SEVEN);
	}
	
	@Test
	public void testSevenSuits()
	{
		Card a1 = new Seven(Suit.CLOVERS);
		Card a2 = new Seven(Suit.DIAMONDS);
		Card a3 = new Seven(Suit.HEARTS);
		Card a4 = new Seven(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.SEVEN);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testEight()
	{
		Card a1 = new Eight(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.EIGHT);
	}
	
	@Test
	public void testEightSuits()
	{
		Card a1 = new Eight(Suit.CLOVERS);
		Card a2 = new Eight(Suit.DIAMONDS);
		Card a3 = new Eight(Suit.HEARTS);
		Card a4 = new Eight(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.EIGHT);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testNine()
	{
		Card a1 = new Nine(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.NINE);
	}
	
	@Test
	public void testNineSuits()
	{
		Card a1 = new Nine(Suit.CLOVERS);
		Card a2 = new Nine(Suit.DIAMONDS);
		Card a3 = new Nine(Suit.HEARTS);
		Card a4 = new Nine(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.NINE);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testTen()
	{
		Card a1 = new Ten(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.TEN);
	}
	
	@Test
	public void testTenSuits()
	{
		Card a1 = new Ten(Suit.CLOVERS);
		Card a2 = new Ten(Suit.DIAMONDS);
		Card a3 = new Ten(Suit.HEARTS);
		Card a4 = new Ten(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.TEN);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testJack()
	{
		Card a1 = new Jack(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.JACK);
	}
	
	@Test
	public void testJackSuits()
	{
		Card a1 = new Jack(Suit.CLOVERS);
		Card a2 = new Jack(Suit.DIAMONDS);
		Card a3 = new Jack(Suit.HEARTS);
		Card a4 = new Jack(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.JACK);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testQueen()
	{
		Card a1 = new Queen(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.QUEEN);
	}
	
	@Test
	public void testQueenSuits()
	{
		Card a1 = new Queen(Suit.CLOVERS);
		Card a2 = new Queen(Suit.DIAMONDS);
		Card a3 = new Queen(Suit.HEARTS);
		Card a4 = new Queen(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.QUEEN);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testKing()
	{
		Card a1 = new King(Suit.HEARTS);
		Assert.assertEquals(a1.getCardValue(), Value.KING);
	}
	
	@Test
	public void testKingSuits()
	{
		Card a1 = new King(Suit.CLOVERS);
		Card a2 = new King(Suit.DIAMONDS);
		Card a3 = new King(Suit.HEARTS);
		Card a4 = new King(Suit.SPADES);
		
		Assert.assertEquals(a1.getCardValue(), Value.KING);
		Assert.assertEquals(a1.getCardSuit(), Suit.CLOVERS);
		Assert.assertEquals(a2.getCardSuit(), Suit.DIAMONDS);
		Assert.assertEquals(a3.getCardSuit(), Suit.HEARTS);
		Assert.assertEquals(a4.getCardSuit(), Suit.SPADES);
	}
	
	@Test
	public void testTwoToString()
	{
		Card a1 = new Ace(Suit.CLOVERS);
		Card a2 = new Two(Suit.DIAMONDS);
		Card a3 = new Three(Suit.HEARTS);
		Card a4 = new Four(Suit.SPADES);
		Card a5 = new Five(Suit.DIAMONDS);
		Card a6 = new Six(Suit.HEARTS);
		Card a7 = new Seven(Suit.SPADES);
		Card a8 = new Eight(Suit.DIAMONDS);
		Card a9 = new Nine(Suit.DIAMONDS);
		Card a10 = new Ten(Suit.SPADES);
		Card a11 = new Jack(Suit.CLOVERS);
		Card a12 = new Queen(Suit.HEARTS);
		Card a13 = new King(Suit.SPADES);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		System.out.println(a6.toString());
		System.out.println(a7.toString());
		System.out.println(a8.toString());
		System.out.println(a9.toString());
		System.out.println(a10.toString());
		System.out.println(a11.toString());
		System.out.println(a12.toString());
		System.out.println(a13.toString());
	}
}
