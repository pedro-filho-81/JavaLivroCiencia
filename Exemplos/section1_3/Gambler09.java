package section1_3;

/*
 * Este programa usa três argumentos de linha de comando inteiros: 
 * aposta, objetivo e testes. O loop while interno neste programa 
 * simula um jogador com $stake que faz uma série de apostas de 
 * $1, continuando até quebrar ou atingir $goal. O tempo de 
 * execução deste programa é proporcional às tentativas vezes o 
 * número médio de apostas. Por exemplo, o terceiro comando abaixo 
 * faz com que quase 100 milhões de números aleatórios sejam 
 * gerados.
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 71). 
 * Educação Pearson. Edição do Kindle.
 */
public class Gambler09 {
   public static void main(String[] args) {

      // entrada de dados
      int stake = Integer.parseInt(args[0]); // valor da aposta
      int goal = Integer.parseInt(args[1]); // objetivos
      int trials = Integer.parseInt(args[2]); // testes

      int bets = 0; // total de apostas
      int wins = 0; // total de vitórias

      for (int t = 0; t < trials; t++) {

         // do one gambler's ruin simulation
         int cash = stake;
         while (cash > 0 && cash < goal) {
            bets++;
            if (Math.random() < 0.5)
               cash++; // win $1
            else
               cash--; // lose $1
         } // end while

         if (cash == goal)
            wins++; // did gambler go achieve desired goal?
      } // end for
        // print results
      System.out.println(wins + " wins of " + trials);
      System.out.println("Percent of games won = " + 100.0 * wins / trials);
      System.out.println("Avg # bets           = " + 1.0 * bets / trials);
   } // end main
} // end class
