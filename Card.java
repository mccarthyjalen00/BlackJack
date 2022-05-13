//Create Cards for Game
public class Card {
	
	//Variables for Card
	private Suit suit;
	private Rank rank;
	
	//Create a Card
	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	//Copy constructor for card by setting suit/rank of a card
	//equal to another Card
	public Card(Card card) {
		this.suit = card.getSuit();
		this.rank = card.getRank();
		
	}
	//Getter methods for suit, rank, value of card
	public Suit getSuit() {
		return suit;
	}
	public Rank getRank() {
		return rank;
	}
	public int getValue() {
		return rank.rankValue;
	}
	
	public String toString() {
		return(rank + " of " + suit + ":" +  "(" + this.getValue() + ")");
	}
	public int compareTo(Card c) {
        //if this card is greater than the other card
        if(this.getValue() > c.getValue()){
            return 1;
        }
        else if(this.getValue() < c.getValue()){
            return -1;
        }
        else{
            return 0;
        }
    }
}

