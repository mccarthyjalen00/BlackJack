//Use enum type to enable the variables to be set constants
public enum Suit {

	//Create Suits of Card (constants)
	NAME1("Hearts"),
	NAME2("Spades"),
	NAME3("Clubs"),
	NAME4("Diamonds");
	
	
	String suitName;
	
	//constructor
	Suit(String suitName) {
		this.suitName = suitName;
	}
	
	public String toString() {
		return suitName;
	}
}
	
	

