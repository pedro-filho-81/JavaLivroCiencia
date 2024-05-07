package section1_4;

/*
 * Este programa usa um argumento de linha de comando 
 * inteiro n e simula a coleta de cupons gerando 
 * números aleatórios entre 0 e n-1 até obter todos 
 * os valores possíveis.
 * 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da 
 * Computação: Uma Abordagem Interdisciplinar (p. 
 * 103). Educação Pearson. Edição do Kindle.
 */
public class CouponCollector02 {

   public static void main(String[] args) {

      // number of cards types
      // variable n receive value of the user
      int n = Integer.parseInt(args[0]);

      // isCollected[i] = true if card i has been colleted
      boolean[] isCollected = new boolean[n];

      // total number of cards collected
      int count = 0;

      // number of distinct cards
      int distinct = 0;

      // repeatedly choose a random card and check whether it's a new one
      while (distinct < n) {
         int value = (int) (Math.random() * n); // random card between 0 and n-1
         count++; // we collected one more card
         if (!isCollected[value]) {
            distinct++;
            isCollected[value] = true;
         } // end if
      } // ens while

      // print the total number of cards collected
      System.out.println(count);
   } // end main
} // end class
