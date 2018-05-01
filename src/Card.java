//a single playing card from the deck of cards
public class Card {
	private String rank;
	private String suit;
	
	//initialize rank and suit of card
	public Card (String cardRank, String cardSuit) {
		rank = cardRank;
		suit = cardSuit;
	}
	
	//return String representation of the Card
	public String toString() {
	return rank + " of " + suit;
	}
}
