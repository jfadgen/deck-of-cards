package deckofcards;

import deckofcards.StandardCard.Ranks;
import deckofcards.StandardCard.Suits;

public interface Card {

	public abstract Ranks getRank();

	public abstract Suits getSuit();

	public abstract int compareTo(Card card2);

	public abstract int compareTo(int i);

}