package gurwinder.kaur991340033;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author gurwinder
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {

            //c.setValue(insert call to random number generator here)
            Random rand = new Random();
            int cardValue = 1 + rand.nextInt((13 - 1) + 1);       
            int cardSuit = 1 + rand.nextInt((4 - 1) + 1);
            System.out.println(cardSuit);
            //  c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Card c = new Card(cardSuit, cardValue);
            magicHand[i] = c;

        }

      /*  Scanner cardValue = new Scanner(System.in);
        System.out.println("Enter Card Value between 1-13");
        int in = cardValue.nextInt();
        Scanner suitValue = new Scanner(System.in);
        System.out.println("Enter suit 1 is Hearts, 2 is Diamonds, 3 is Spades,4 is Clubs");
        int in2 = suitValue.nextInt(); */
        int luckyCard=1;
        int suitNum=4;
        Card userCard = new Card(luckyCard, suitNum);
    //  cardValue.close();
    //  suitValue.close();

        Boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].equals(userCard)) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Card is Found");
        } else {
            System.out.println("Card is Not Found");
        }
       
    }

}
