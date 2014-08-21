package deckofcards.test;

import deckofcards.Card;
import deckofcards.CustomDeck;
import deckofcards.Deck;
import deckofcards.StandardCard;
import deckofcards.StandardCard.Ranks;
import deckofcards.StandardCard.Suits;
import deckofcards.StandardDeck;

public class DeckTest {

	public static void main(String[] args) {
		System.out.println("Deck of Cards test functions.\n========\n");
		testNewDeck();
		testShuffleAndSortDeck();
		testCompareCards();
		testDealCards();
		testCustomDeckRule();
	}

	private static void testNewDeck() {
		System.out.println("Running testNewDeck");
		Deck deck = new StandardDeck();

		System.out.println(deck.toString());

	}

	private static void testShuffleAndSortDeck() {

		System.out.println("Running testShuffleAndSortDeck");
		Deck deck = new StandardDeck();

		System.out.println("New:      " + deck.toString());
		deck.shuffle();
		System.out.println("Shuffled: " + deck.toString());
		deck.sort();
		System.out.println("Sorted:   " + deck.toString());

	}

	private static void testCompareCards() {

		System.out.println("Running testCompareCards");

		Deck deck = new StandardDeck();

		Card card1 = new StandardCard(Ranks.THREE, Suits.CLUBS);
		Card card2 = new StandardCard(Ranks.JACK, Suits.HEARTS);
		Card card3 = new StandardCard(Ranks.KING, Suits.HEARTS);

		System.out.println("Expecting 8: " + deck.compareCards(card1, card2));
		System.out.println("Expecting 2: " + deck.compareCards(card2, card3));
		System.out.println("Expecting 10: " + deck.compareCards(card1, card3));

	}

	private static void testDealCards() {
		System.out.println("Running testDealCards");

		Deck deck = new StandardDeck();
		System.out.println("Sorted Card 1: " + deck.dealCard());
		System.out.println("Sorted Card 2: " + deck.dealCard());
		System.out.println("Sorted Card 3: " + deck.dealCard());
		System.out.println("Sorted Card 4: " + deck.dealCard());
		System.out.println("Sorted Card 5: " + deck.dealCard());
		deck.shuffle();
		System.out.println("Shuffled Card 1: " + deck.dealCard());
		System.out.println("Shuffled Card 2: " + deck.dealCard());
		System.out.println("Shuffled Card 3: " + deck.dealCard());
		System.out.println("Shuffled Card 4: " + deck.dealCard());
		System.out.println("Shuffled Card 5: " + deck.dealCard());
	}

	private static void testCustomDeckRule() {

		CustomDeck customDeck = new CustomDeck();

		Card card1 = new StandardCard(Ranks.THREE, Suits.CLUBS);
		Card aceCard = new StandardCard(Ranks.ACE, Suits.SPADES);

		// Control - Ace vs Ace.
		customDeck.setAcesHigh(true);
		System.out.println("Default: Ace vs Ace: "
				+ customDeck.compareCards(aceCard, aceCard));
		customDeck.setAcesHigh(false);
		System.out.println("Custom: Ace Ace: "
				+ customDeck.compareCards(aceCard, aceCard));

		customDeck.setAcesHigh(true);
		System.out.println("Default: Ace High vs. Three: "
				+ customDeck.compareCards(card1, aceCard));
		customDeck.setAcesHigh(false);
		System.out.println("Custom: Ace Low vs. Three: "
				+ customDeck.compareCards(card1, aceCard));

	}

}
