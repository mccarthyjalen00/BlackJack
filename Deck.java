//Create Deck to be used
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Deck  {

	//Create ArrayList for deck
	private ArrayList<Card> deck;
	
	//Constructor for Deck
	Deck() {
		deck = new ArrayList<Card>();
	}
	//add method for cards
	public void add(Card card) {
	  deck.add(card);
	}
	public Deck(Deck c){
        Collections.copy(this.deck, c.getCards());
    }
	//Create new Deck that takes a boolean value
	// for loop suit/rank to get values of each
	//add new cards to
	public Deck(boolean makeDeck) {
		deck = new ArrayList<Card>();
		if (makeDeck) {
			for(Suit suit: Suit.values()) {
				for (Rank rank: Rank.values() ) {
					deck.add(new Card(suit, rank));
				}
			}
		}	
	}
	public void addCard(Card card){
        deck.add(card);
    }
	public void addCards(ArrayList<Card> cards){
        deck.addAll(cards);
    }
	public String toString(){
        //A string to hold everything we're going to return
        String output = "";

        for(Card card: deck){
            output += card;
            output += "\n";
        }
        return output;
    }
	//Create shuffle method
	public void shuffle() {
		Collections.shuffle(deck, new Random());
	}
	public Card takeCard() {
		//Take a copy of first card from deck
		Card cardToTake = new Card(deck.get(0));
		//Remove card from deck
		deck.remove(0);
		//Give card back
		return cardToTake;
	}
	 public boolean hasCards(){
	        if (deck.size()>0){
	            return true;
	        }
	        else{
	            return false;
	        }
	 }
	        public int cardsLeft(){
	            return deck.size();
	        }
	        
	        public ArrayList<Card> getCards() {
	            return deck;
	        }
	        
	        public void emptyDeck(){
	            deck.clear();
	        }
	        public void reloadDeckFromDiscard(Deck discard){
	            this.addCards(discard.getCards());
	            this.shuffle();
	            discard.emptyDeck();
	            System.out.println("Ran out of cards, creating new deck from discard pile & shuffling deck.");
	        }
	
}	
	
	
	
	
	

