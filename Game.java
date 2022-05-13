
public class Game {
	
	//Create discarded deck
	private Deck deck, discarded;
	//Create Dealer and Player
	private Dealer dealer;
	private Person player;
	
	
	public Game() {
		
		deck = new Deck(true);
		
		discarded = new Deck();
		
		dealer = new Dealer();
		player = new Player();
		
		
		deck.shuffle();
		startRound();
	}
	
	private void startRound() {
		//Give dealer two cards
		dealer.getHand().takeCardFromDeck(deck);
		dealer.getHand().takeCardFromDeck(deck);
		
		//Give player two cards
		player.getHand().takeCardFromDeck(deck);
		player.getHand().takeCardFromDeck(deck);
		
		//Print dealer and player hands
		dealer.printFirstHand();
		player.printHand();
		
		//Check if dealer has black jack
		if (dealer.hasBlackJack()) {
			//Show dealer has black jack
			dealer.printHand();
		//Check if player also has black jack
		if (player.hasBlackJack()) {
			//End round with a push
			System.out.println("You both have 21- push");
			startRound();
		}
			else {
				System.out.println("Dealer has Black Jack. You lose");
				dealer.printHand();
				startRound();
			}
		}
		//Check if player has black jack
		if (player.hasBlackJack()) {
			System.out.println("Congratulations!!! You have Black Jack");
			player.printHand();
			startRound();
		}
			((Player) player).makeDecision(deck, discarded);
			//Check if they busted
	        if(player.getHand().calculatedValue() > 21){
	            System.out.println("You have gone over 21.");
	            
	            startRound();
	        }
	      //Now it's the dealer's turn
	        dealer.printHand();
	        while(dealer.getHand().calculatedValue()<17){
	            dealer.hit(deck, discarded);
	        }

	        //Check who wins and count wins or losses
	        if(dealer.getHand().calculatedValue()>21){
	            System.out.println("Dealer busts");
	        }
	        else if(dealer.getHand().calculatedValue() > player.getHand().calculatedValue()){
	            System.out.println("You lose.");
	        }
	        else if(player.getHand().calculatedValue() > dealer.getHand().calculatedValue()){
	            System.out.println("You win.");            
	        }
	        else{
	            System.out.println("Push.");
	        }

	        //Start a new round
	        startRound();
	    }
	public static void pause(){
	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

			
		}
	
	
	
		
	


