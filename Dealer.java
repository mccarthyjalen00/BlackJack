//Create Dealer

public class Dealer extends Person{

	//Create a new Dealer
	
	public Dealer() {
		super.setName("Dealer");
	}
	
	public void printFirstHand() {
		System.out.println("The dealer's hand looks like this " +super.getHand().getCard(0));
		System.out.println("The second card is faced down");
	}
}
