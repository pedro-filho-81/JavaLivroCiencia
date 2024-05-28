package section1_3;
/*
 * Este programa usa um número de ponto flutuante positivo c como 
 * argumento de linha de comando e calcula a raiz quadrada de c 
 * com precisão de 15 casas decimais, usando o método de Newton 
 * (ver texto). Sedgewick, Robert; Wayne, Kevin. Ciência da 
 * Computação: Uma Abordagem Interdisciplinar (p. 66). 
 * Educação Pearson. Edição do Kindle.
 */

public class Sqrt07 {
   public static void main(String[] args) {
      // entrada de dados
      double c = Double.parseDouble(args[0]);

      double EPSILON = 1e-15;
      double t = c;
      while (Math.abs(t - c / t) > EPSILON * t) {
         t = (c / t + t) / 2.0;
      } // end while
      System.out.println("t = " + t);
   } // end main
} // end class
