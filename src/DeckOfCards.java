public class DeckOfCards {

	private Card deck[]; // deck is an array of Card objects
	private int currentCard; // [i] of next card to be dealt
	private final int TOTAL_NUMBER_OF_CARDS = 52; // constant card count for Standard Deck

	// constructor will fill deck with cards
	public DeckOfCards() {
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] suit = { "Diamonds", "Spades", "Clubs", "Hearts" };

		deck = new Card[TOTAL_NUMBER_OF_CARDS]; // Standard Deck of 52 Cards
		currentCard = 0; // a current card is set so first dealt card will be deck[0]

		for (int i = 0; i < deck.length; i++) {
			// Zach's recommendation of using Modulus.. rank uses remainder so we can look
			// at each
			// individual item, suit is iterated 13 times each to populate deck with card
			// objects

			deck[i] = new Card(rank[i % 13], suit[i / 13]);
		}
	}

	// Shuffle the deck
	public void shuffle() { // shuffle starts at [0] each time

		currentCard = 0;

		for (int i = 0; i < deck.length; i++) {
			int shuffled = (int) (Math.random() * deck.length);
			/*
			 * the below is a common pattern i should take to mind when swapping, similar to
			 * reverse Array problem
			 */
			Card holder = deck[i];
			deck[i] = deck[shuffled];
			deck[shuffled] = holder;
		}
	}

	public Card deal() { // returns current card or return nothing if all cards are dealt
		if (currentCard < deck.length) {
			return deck[currentCard++];
		} else {
			return null;
		}
	}
}
