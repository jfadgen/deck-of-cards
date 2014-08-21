package deckofcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import deckofcards.StandardCard.Ranks;
import deckofcards.StandardCard.Suits;

public class StandardDeck implements Deck {

	private int numCards;

	private List<StandardCard> deck = null;

	private int numCardsDealt;

	public StandardDeck() {
		this.initializeDeck();
		this.numCards = this.deck.size();
		this.numCardsDealt = 0;
	}

	private void initializeDeck() {

		this.deck = new ArrayList<StandardCard>(this.numCards);
		for (Suits s : Suits.values()) {
			for (Ranks r : Ranks.values()) {
				this.deck.add(new StandardCard(r, s));
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(1024);
		for (int i = 0; i < this.numCards; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(deck.get(i));
		}
		return sb.toString();
	}

	@Override
	public void shuffle() {
		Collections.shuffle(this.deck);
		this.numCardsDealt = 0;
	}

	@Override
	public void sort() {
		this.initializeDeck();
	}

	@Override
	public int compareCards(Card c1, Card c2) {
		return c1.compareTo(c2);
	}

	@Override
	public Card dealCard() {
		Card thisCard = this.deck.get(numCardsDealt);
		++this.numCardsDealt;
		return thisCard;
	}

	public int getNumCardsDealt() {
		return numCardsDealt;
	}

}
