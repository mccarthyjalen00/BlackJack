//Create Players Hand
import java.util.ArrayList;
public class Hand {
	
	
	private ArrayList<Card> hand;
	
	public Hand() {
		hand = new ArrayList<Card>();
	}
	
	public void takeCardFromDeck(Deck deck) {
		hand.add(deck.takeCard());
	}
	public String toString() {
		String output = " ";
		for (Card card: hand) {
			output += card;
		}
		return output;
	}
	public int calculatedValue() {
		
		//count number of aces and value of cards
		int value = 0;
		int aceValue = 0;
		//for each card in hand
		for (Card card: hand) {
			//add card value to hand
			value += card.getValue();
			//count number of aces added
			if (card.getValue() ==11) {
				aceValue++;
			}
		}
		//if a scenario happens where we have more than one ace in hand
		if (value > 21 && aceValue > 0) {
			while (aceValue > 0 && value > 21) {
				aceValue --;
				value -= 10; 
			}
		}
		return value;
	}
	
	public Card getCard(int index) {
		return hand.get(index);
	}
}
