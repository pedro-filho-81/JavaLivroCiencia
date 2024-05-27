package section1_3;

/*
 * Este programa usa um argumento de linha de comando inteiro n e 
 * usa loops for aninhados para imprimir uma tabela n por n com um 
 * asterisco na linha i e na coluna j se i divide j ou j divide i. 
 * As variáveis ​​de controle do loop i e j controlam o cálculo. 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 63). Educação Pearson. 
 * Edição do Kindle.
 */

public class DivisorPattern04 {
   public static void main(String[] args) {

      // data enter
      int n = Integer.parseInt(args[0]);

      // loop for aninhado
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            // condição
            if (i % j == 0 || j % i == 0) { // se verdade
               // print
               System.out.print("* ");
            } else { // se falso
               // print
               System.out.print("  ");
            } // end else
         } // end for interno
         System.out.println(i);
      } // end for externo
   } // end main
} // end class
