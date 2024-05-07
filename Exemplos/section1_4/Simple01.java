package section1_4;

/*
 * Este programa recebe dois 
 * argumentos de linha de comando m e 
 * n e produz uma amostra de m dos 
 * inteiros de 0 a n-1. Este processo 
 * é útil não apenas em loterias 
 * estaduais e locais, mas em 
 * aplicações científicas de todos os 
 * tipos. Se o primeiro argumento for 
 * igual ao segundo, o resultado será 
 * uma permutação aleatória dos 
 * inteiros de 0 a n-1. Se o primeiro 
 * argumento for maior que o segundo, 
 * o programa terminará com uma 
 * ArrayOutOfBoundsException.
 * 
 * Sedgewick, Robert; Wayne, Kevin. 
 * Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (pp. 
 * 98-99). Educação Pearson. Edição 
 * do Kindle.
 */
import java.util.Scanner;

public class Simple01 {
   public static void main(String[] args) {

      // create input object
      Scanner input = new Scanner(System.in);

      // data entry
      System.out.println("Digite um inteiro: ");
      int m = input.nextInt();

      System.out.println("Digite outro inteiro: ");
      int n = input.nextInt();
      System.out.println();

      // create permutation 0, 1, ..., n-1
      int[] perm = new int[n]; // create array
      // for loop to initialize array
      for (int i = 0; i < n; i++)
         // array receive i value
         perm[i] = i;

      System.out.println("Tamanho do array: " + perm.length);

      // print result
      for (int i = 0; i < m; i++)
         System.out.println(i + "\t" + perm[i]);

      System.out.println(); // new line

      // create random simple perm[0],perm[1] ..., perm[m - 1]m
      for (int i = 0; i < m; i++) {

         // random integer between i and (n - 1)
         int r = i + (int) (Math.random() * (n - 1));

         // swap element at indices i and r
         int temp = perm[r];
         perm[r] = perm[i];
         perm[i] = temp;
      } // end for

      // print result
      for (int i = 0; i < m; i++)
         System.out.println(i + "\t" + perm[i]);

      System.out.println(); // new line

   } // end main
} // end class
