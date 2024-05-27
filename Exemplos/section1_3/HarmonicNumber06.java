package section1_3;

/*
 * Este programa pega um argumento de linha de comando inteiro n e 
 * calcula o valor do enésimo número harmônico. O valor é 
 * conhecido pela análise matemática como sendo cerca de ln(n) + 0,
 * 57721 para n grande. Observe que ln(1.000.000) + 0,57721 ≈ 14,39272.
 * 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma Abordagem 
 * Interdisciplinar (p. 65). Educação Pearson. Edição do Kindle.
 */
public class HarmonicNumber06 {
   public static void main(String[] args) {
      // compute harmonic number
      int n = Integer.parseInt(args[0]);
      double sum = 0.0;

      // loop for
      for (int i = 1; i <= n; i++) {
         sum += 1.0 / i;
      } // end for
      System.out.println("Sum = " + sum);
   } // end main
} // end class
