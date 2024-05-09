package section1_4;

/*
 * Este programa pega um argumento de linha de 
 * comando inteiro n e calcula o número de primos 
 * menor ou igual a n. Para fazer isso, ele calcula 
 * uma matriz booleana com isPrime[i] definido como 
 * verdadeiro se i for primo e como falso caso 
 * contrário. Primeiro, ele define todos os elementos 
 * do array como verdadeiros para indicar que nenhum 
 * número é inicialmente conhecido como não primo. Em 
 * seguida, ele define elementos falsos da matriz 
 * correspondentes a índices que são conhecidos como 
 * não primos (múltiplos de primos conhecidos). Se a
 * [i] ainda for verdadeiro depois de todos os 
 * múltiplos de primos menores terem sido definidos 
 * como falsos, então sabemos que i é primo. O teste 
 * de terminação no segundo loop for é i <= n/i em 
 * vez do ingênuo i <= n porque qualquer número sem 
 * fator menor que n/i não tem fator maior que n/i, 
 * então não precisamos procurar para tais fatores. 
 * Esta melhoria torna possível executar o programa 
 * para n grandes.
 * 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da 
 * Computação: Uma Abordagem Interdisciplinar (pp. 
 * 104-105). Educação Pearson. Edição do Kindle.
 */
public class PrimeSieve03 {

   /**
    * @param args
    */
   public static void main(String[] args) {
      // variable n receive value of the user
      int n = Integer.parseInt(args[0]);

      // initially assume all integers are prime
      boolean[] isPrime = new boolean[n + 1];
      int[] numerosPrimos = new int[n + 1];

      for (int i = 2; i <= n; i++) {
         // array assume que todos os valores são verdadeiros
         isPrime[i] = true; // inicializa com true
      } // end for

      // mark non-primes <= n using Sieve of Eratosthenes
      for (int factor = 2; factor * factor <= n; factor++) {

         // if factor is prime, then mark multiples of factor as non-prime
         // suffices to consider multiples factor, factor+1, ..., n/factor
         if (isPrime[factor]) {
            for (int j = factor; factor * j <= n; j++) {
               isPrime[factor * j] = false;
            }
         }
      }

      // count primes
      int primes = 0;
      System.out.print("São números primos: ");
      for (int i = 2; i <= n; i++) {
         if (isPrime[i]) {
            primes++;
            numerosPrimos[i] = i;
            System.out.print(numerosPrimos[i] + ", ");
         }
      }

      System.out.println("\nThe number of primes <= " + n + " is " + primes);
   }
}