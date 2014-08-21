package deckofcards;

public interface Deck {

	public abstract void shuffle();

	public abstract void sort();

	/**
	 * Returns the difference between two cards
	 * 
	 * @param c1
	 * @param card2
	 * @return
	 */
	public abstract int compareCards(Card c1, Card card2);

	public abstract Card dealCard();
}