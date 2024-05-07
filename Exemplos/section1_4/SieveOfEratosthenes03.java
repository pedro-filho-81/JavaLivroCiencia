package section1_4;

public class SieveOfEratosthenes03 {

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