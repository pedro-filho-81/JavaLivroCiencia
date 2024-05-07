package section1_4;

public class NumerosHarmonicos03 {
   public static void main(String[] args) {
      int n = 15;
      double[] harmonic = new double[n];
      for (int i = 1; i < n; i++)
         harmonic[i] = harmonic[i - 1] + 1.0 / i;

      for (int i = 0; i < n; i++)
         System.out.println(i + " = " + harmonic[i]);
   }
}
