package deckofcards;

import deckofcards.StandardCard.Ranks;

public class CustomDeck extends StandardDeck implements Deck {

	boolean acesHigh = true;

	@Override
	public int compareCards(Card c1, Card c2) {

		if (!acesHigh) {
			if (c1.getRank().equals(Ranks.ACE)
					&& c2.getRank().equals(Ranks.ACE)) {
				return 0;
			} else if (c1.getRank().equals(Ranks.ACE)
					&& !c2.getRank().equals(Ranks.ACE)) {
				return c2.compareTo(1);
			} else if (!c1.getRank().equals(Ranks.ACE)
					&& c2.getRank().equals(Ranks.ACE)) {
				return (c1.compareTo(1));
			}
		}

		return c1.compareTo(c2);
	}

	public boolean isAcesHigh() {
		return acesHigh;
	}

	public void setAcesHigh(boolean acesHigh) {
		this.acesHigh = acesHigh;
	}

}
