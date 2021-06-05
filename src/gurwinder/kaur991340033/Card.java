package gurwinder.kaur991340033;

/**Gurwinder Kaur
 * Assignment 1, June 5th 2021
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

    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
   
   
    
}
