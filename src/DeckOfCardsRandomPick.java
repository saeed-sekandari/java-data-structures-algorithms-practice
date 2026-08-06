/*
 *This program randomly shuffle a deck of cards and then pick 4 cards
 * and display their rank and suits.
 */
public class DeckOfCardsRandomPick {
    public static void main(String[] args){
        int [] deck = new int[52];
        String [] suits = { "Spades", "Hearts", "Diamonds","Clubs"};
        String [] ranks = {"Ace","2","3","4","5","6","7","8","9","10"
        ,"Jack","Queen","King"};

        //Initialize the array
        for (int i=0; i < deck.length; i++){
            deck[i] = i;
        }
        //Randomly shuffle the cards
        for (int i= 0; i<deck.length; i++){
            int randomIndex = (int) (Math.random()* deck.length);
            int tmep = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = tmep;
        }
        //Display the first four cards
        for(int i = 0; i< 4; i++){
            String suit = suits[deck[i]/13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card Number " + deck[i] +": "
            + rank + " of " + suit);
        }

    }

}
