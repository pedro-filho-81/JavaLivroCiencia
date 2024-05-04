package section1_4;

/*
 * Declare, create and initialize the array.
 * 
 * o código a seguir cria um array de n 
 * elementos, cada um do tipo double e 
 * inicializado com 0,0:
 */
public class Exp01 {
   public static void main(String[] args) {
      // declare and create a variable
      int n = 10;
      // declare the array
      double[] a;
      // create the array
      a = new double[n];
      // loop for to initialize array
      for (int i = 0; i < n; i++) {
         // initialize the array
         a[i] = 0.0;
      } // end for
   } // end main
} // end class
