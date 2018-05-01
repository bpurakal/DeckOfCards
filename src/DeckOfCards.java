import java.util.Random;

/*note to self: this Deck Of Cards class works by itself but I'm in the midst of
 * making it more OOP with the Card and DOCTest<will hold main method> classes 
 * as well. 4/29/18.. continue to work on Card.java
 * 
 * 4/30/2018 more oop updates.. reference dietel 
 */
public class DeckOfCards {

	private Card deck[]; // deck is an array of Card objects
	private int currentCard; // [i] of next card to be dealt
	private final int NUMBER_OF_CARDS = 52; // constant card count for Standard Deck

	// constructor will fill deck with cards
	public DeckOfCards() {
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] suit = { "Diamonds", "Spades", "Clubs", "Hearts" };
		deck = new Card[NUMBER_OF_CARDS]; //Standard Deck of 52 Cards

	// Print full deck
	static Deck  {
	for(int i = 0;i<deck.length;i++){
		// Zach's recommendation of using Modulus.. rank uses remainder so we can look
		// at each individual item, suit is iterated 13 times each
		deck[i] = rank[i % 13] + " of " + suit[i / 13];
		System.out.println(deck[i]);
	}}

	public Card dealCard() { //returns current card or return nothing if all cards are dealt
			if (currentCard < deck.length){
				return deck[currentCard++]; 
		}else {
			return null;}
		}

	// Shuffle the deck
	public void shuffle() { // shuffle starts at [0] each time
		for (int i = 0; i < deck.length; i++) {
			int shuffled = (int) (Math.random() * deck.length);

			/*
			 * the below is a common pattern i should take to mind when swapping, similar to
			 * reverse Array problem
			 */
			String holder = deck[i];
			deck[i] = deck[shuffled];
			deck[shuffled] = holder;
		}
	}

	// for (String card : deck) {
	// System.out.println(card);
	// }

}

}
