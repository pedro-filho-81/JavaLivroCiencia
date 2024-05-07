package section1_4;

public class DeckOfCards02 {
   public static void main(String[] args) {
      // declare, create and initialize arrays
      String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
      };

      String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
      };

      // print random card
      // int i = (int) (Math.random() * RANKS.length);
      // int j = (int) (Math.random() * SUITS.length);
      // System.out.println(RANKS[i] + " of " + SUITS[j]);

      // Setting array values at compile time
      String[] deck = new String[RANKS.length * SUITS.length];
      for (int i = 0; i < RANKS.length; i++) {
         for (int j = 0; j < SUITS.length; j++) {
            deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            System.out.println(RANKS[i] + " of " + SUITS[j]);
         }
      }
      System.out.println();

      // embaralhar cartas
      int n = deck.length;
      for (int i = 0; i < n; i++) {
         int r = i + (int) (Math.random() * (n - i));
         String temp = deck[r];
         deck[r] = deck[i];
         deck[i] = temp;
      } // end for 

      // print array value
      for (int i = 0; i < n; i++) {
         System.out.println(deck[i]);
      } // end for print
   } // end main
} // end class
