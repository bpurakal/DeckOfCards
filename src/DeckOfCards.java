
public class DeckOfCards {

	public static void main(String[] args) {
		
		String [] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		String [] deck = new String[52]; //Standard Deck of 52 Cards
		
		
		//Print full deck
		for (int i = 0; i< deck.length; i++) {
			//Zach's recommendation of using Modulus.. rank uses remainder so we can look at each individual item, suit is iterated 13 times each
			deck[i] = rank[i%13] + " of " + suit[i/13] ; 
			System.out.println(deck[i]);
		}
		
		//Shuffle the deck
		for (int i = 0; i< deck.length; i++) {
			int shuffled = (int)(Math.random()*deck.length);
			
			String holder = deck[i];
			deck[i] = deck[shuffled];
			deck[shuffled] = holder;
		}
		
		for (String card: deck) {
			System.out.println(card);
		}
		
	}

}
