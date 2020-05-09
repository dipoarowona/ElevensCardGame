package apFinalProject;
//card class for Final AP Project
public class Card {
	private String suit; //String value that holds the suit of the card
	private String rank; //String value that holds the rank of the card
	private int pointValue;//int value that holds the point value.
   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		//TO BE IMPLEMENTED IN ACTIVITY 1 - done
		this.suit = cardSuit;
		this.rank = cardRank; 
		this.pointValue = cardPointValue;
	}


	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	public String suit() {
		//TO BE IMPLEMENTED IN ACTIVITY 1 - done
		return this.suit;
   }

	/**
	 * Accesses this <code>Card's</code> rank.
	 * @return this <code>Card's</code> rank.
	 */
	public String rank() {
		//TO BE IMPLEMENTED IN ACTIVITY 1 - done
		return this.rank;
	}

   /**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int pointValue() {
		//TO BE IMPLEMENTED IN ACTIVITY 1 - done
		return this.pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		//TO BE IMPLEMENTED IN ACTIVITY 1 - done
		if((this.suit.equals(otherCard.suit())) && (this.rank.equals(otherCard.rank())) && (this.pointValue == otherCard.pointValue()) ){
			return true;
		}
		else {
			return false;
		}
		
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		//TO BE IMPLEMENTED IN ACTIVITY 1 - done
		String output = this.rank + " of " + this.suit + " (Point Value = " + this.pointValue + ")";
		return output;
	}
}
