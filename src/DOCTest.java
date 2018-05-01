
public class DOCTest {

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle(); // Will Shuffle the deck of cards in random order

		// print dealt cards in order
		for (int i = 0; i < 13; i++) {
			// deal/draw 4 cards
			System.out.printf("%-15s%-15s%-15s%-15s\n", deck.deal(), deck.deal(), deck.deal(), deck.deal());
		}
	}

}
