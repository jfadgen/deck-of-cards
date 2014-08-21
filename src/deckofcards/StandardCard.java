package deckofcards;

public class StandardCard implements Card {

	public static enum Suits {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}

	public static enum Ranks {
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(
				10), JACK(11), QUEEN(12), KING(13), ACE(14);
		private int value;

		private Ranks(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

	private Ranks rank;

	private Suits suit;

	public StandardCard(Ranks rank, Suits suit) {
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public String toString() {
		return String.format("%s of %s", rank, suit);
	}

	@Override
	public int compareTo(Card card) {
		return card.getRank().compareTo(this.rank);
	}

	@Override
	public int compareTo(int i) {
		// TODO Auto-generated method stub
		return i - this.getRank().value;
	}

	@Override
	public Ranks getRank() {
		return rank;
	}

	@Override
	public Suits getSuit() {
		return suit;
	}
}
