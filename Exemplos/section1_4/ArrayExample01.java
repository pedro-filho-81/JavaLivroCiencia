package section1_4;

import java.util.Scanner;

public class ArrayExample01 {
   public static void main(String[] args) {
      // create input object
      Scanner input = new Scanner(System.in);

      // data entre
      System.out.print("Digite o tamanho do array: ");
      // variable receive value of the user
      int n = input.nextInt();

      // declare and create array
      double[] a = new double[n];
      // for loop to initialize array
      for (int i = 0; i < n; i++) {
         // array receive random value
         a[i] = Math.random();
      } // end for initialize

      // print array value, one per line
      System.out.println("a[" + n + "]");
      System.out.println("---------------");
      // for loop to print array value, one per line
      for (int i = 0; i < n; i++) {
         System.out.println(i + "\t" + a[i]);
      } // end for loop print
      System.out.println();
      System.out.println("a = " + a);
      System.out.println();

      // find the MaxiMuM and MiniMus value
      double max = Double.NEGATIVE_INFINITY;
      double min = 1;
      // for loop to find the maximum and the minimus array value
      for (int i = 0; i < n; i++) {
         if (max < a[i])
            max = a[i];
         if (min > a[i])
            min = a[i];
      }
      System.out.println("max = " + max);
      System.out.println("min = " + min);

      // average
      float sum = 0.0f; // variable sum
      // for loop to calculate array average
      for (int i = 0; i < n; i++) {
         // sum array values
         sum += a[i];
      } // end for average
        // print average
      System.out.println("average = " + sum / n);

      // copy to other array
      // declare and create array b
      double[] b = new double[n];
      // for loop to copy to other array
      for (int i = 0; i < n; i++) {
         b[i] = a[i];
      } // end for copy

      // print array value, one per line
      System.out.println("b[" + n + "]");
      System.out.println("---------------");
      // for loop to print array value, one per line
      for (int i = 0; i < n; i++) {
         System.out.println(i + "\t" + b[i]);
      } // end for loop print
      System.out.println();
      System.out.println("b = " + b);
      System.out.println();

      // for loop to reverse the order
      for (int i = 0; i < n / 2; i++) {
         double temp = b[i];
         b[i] = b[n - i - 1];
         b[n - i - 1] = temp;
      } // end for reverse

      // print array value, one per line
      System.out.println("b[" + n + "]");
      System.out.println("---------------");
      // for loop to print array value, one per line
      for (int i = 0; i < n; i++) {
         System.out.println(i + "\t" + b[i]);
      } // end for loop print
      System.out.println(); // new line
      System.out.println("b = " + b);
      System.out.println(); // new line

      // dot product of a[] and b[]
      double dotProduct = 0.0;
      for (int i = 0; i < n; i++) {
         dotProduct = a[i] * b[i];
      } // end for dotProduct
        // print
      System.out.println("dot product of a[] and b[] = " + dotProduct);
      System.out.println(); // new line

   } // end main
} // end class
