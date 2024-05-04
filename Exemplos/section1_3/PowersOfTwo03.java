package section1_3;

import java.util.Scanner;

/*
 *Este programa pega um argumento de linha de comando 
 inteiro n e imprime uma tabela das potências de 2 
que são menores ou iguais a 2n. Cada vez que o loop passa, ele aumenta o valor de i e dobra o valor da potência. Mostramos apenas as três primeiras e as três últimas linhas da tabela; o programa imprime n+1 linhas.

Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma Abordagem Interdisciplinar (p. 57). Educação Pearson. Edição do Kindle 
 */
public class PowersOfTwo03 {
   public static void main(String[] args) {
      // create input object
      Scanner input = new Scanner(System.in);

      // data input
      System.out.print("Digite um número inteiro: ");
      // variable n receive value of the user
      int n = input.nextInt();

      // variables
      int power = 1;
      int i = 0;
      boolean a = (i <= n);

      // loop while
      while (i <= n) {
         // display
         System.out.println(i + "\t" + power + "\t" + a);
         // calculate
         power = 2 * power;
         // increment
         i = i + 1;
      }
   }
}
