package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * editied by Deril Thuruthy
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
               Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++)
        {
            Card Randomcard = new Card();
            Randomcard.setValue((int)(1+Math.random()*13));
            //card.setValue(insert call to random number generator here)
            
            Randomcard.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            hand[i] = Randomcard;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            System.out.println(hand[i].getValue()+" "+hand[i].getSuit());
            //       Don't worry about duplicates at this point
        }
        
        Card InpCard = new Card();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number from 1-13(11 for Jack,12 for Queen, 13 for King) : ");
        InpCard.setValue(inp.nextInt());
        
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter a for Card Suit (Hearts, Diamonds, Spades, Clubs) !Caution:Enter the names as given in the line! : ");
        InpCard.setSuit(Card.SUITS[cardSuit(inp2.nextLine())]);
        
        System.out.println(InpCard.getValue()+ " " +InpCard.getSuit());//this line print the users card
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        // 1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        
        boolean cardVal = false;
        for(int i = 0; i< hand.length; i++)
        {
            if(InpCard.getValue()== hand[i].getValue() && InpCard.getSuit().equals(hand[i].getSuit())){
                cardVal = true;
            }
         
        }
        
        if(cardVal == true)
        {
            System.out.println("Match found");
            printInfo();
        }
        else
        {
            System.out.println("No Match");
        }
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

            private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Deril Biny);
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- movies");
        System.out.println("-- swimming");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- riding");

        System.out.println();
        
    
    }
    
    private static int cardSuit(String suit)
    {
        if(suit.equalsIgnoreCase("hearts"))
        {
            return 0;
        }
        else if(suit.equalsIgnoreCase("diamonds"))
        {
            return 1;
        }
        else if(suit.equalsIgnoreCase("spades"))
        {
            return 2;
        }
        else
        {
            return 3;
        }
        
    }

}
