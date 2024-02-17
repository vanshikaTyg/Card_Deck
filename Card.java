// VANSHIKA TYAGI 
// 22070126128
// AIML B3

/*  Write a menu-driven Java Program for the following: There are 52 cards in a deck, each of which belongs to one of four suits and one of 13 ranks.
    Should have methods:
	i)    createDeck()         //Can also add this  method as constructor
	ii)   printDeck()
	iii)  printCard()
	iv)   sameCard()         //Card which is from same suit
	v)    compareCard()     //Card having same rank or number
	vi)   findCard()       //Search for particular card
	vii)  dealCard()      //Print 5 random cards
	viii) shuffleCard()  //Randomise the deck
*/
	
	

public class Card {
	private String suit;
	private String value;
	
	//initializing values for that particular instance
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	// public card() {}
	public String getSuit(){
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getValue(){
		return value;
	}
	
	public void getSuit(String value){
		this.value = value;
	}
	
	// to return value and suit as String
	public String toString(){
		return "\n" + value + " of " + suit;
	}
}
	
	