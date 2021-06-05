package gurwinder.kaur991340033;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * gurwinder Kaur
 * Assignment 1
 * @author Gurwinder
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    
   
    public Card(int suit, int value) 
    {
        this.suit = SUITS[suit-1];
        this.value= value; 
    }
    /*
    @Override
    public String toString(){
    
       return "SUIT:" +suit +"\nVALUE: " +value;
    
    }
    @Override
    public boolean equals(Object o){
        Boolean equals= false; 
        Card c= (Card)o;
        if(c.suit.equals(this.suit) && c.value== this.value){
            equals = true; 
        }
        return equals;
    } 
*/
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
   
   
    
}
