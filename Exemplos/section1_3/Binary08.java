package section1_3;

/*
 * Este programa pega um número inteiro positivo n 
 * como argumento de linha de comando e imprime 
 * a representação binária de n, eliminando potências 
 * de 2 em ordem decrescente (ver texto).
 * 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: 
 * Uma Abordagem Interdisciplinar (p. 69). 
 * Educação Pearson.  * Edição do Kindle.
 */
public class Binary08 {
   public static void main(String[] args) {
      // print binary represention of n
      int n = Integer.parseInt(args[0]);
      // variable
      int power = 1;
      // while power <= a metade de n
      while (power <= n / 2) {
         power *= 2;
         System.out.println("power = " + power);
      } // end while

      System.out.print(n + " em binário é: ");

      // enquanto power maior que zero
      while (power > 0) {
         // cast out power of 2 in decreasing order
         if (n < power) {
            System.out.print(0);
         } else {
            System.out.print(1);
            n -= power;
         } // end if else
         power /= 2;
      } // end while
      System.out.println();
   } // end main
} // end class
