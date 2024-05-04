public class IntMultiplicationDivision06 {

   public static void main(String[] args) {

      // variables receives value from the user
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      // calculate values
      int p = a * b; // Multiplication
      int q = a / b; // division
      int r = a % b; // remainder

      // display
      System.out.println("Multiplication: " + a + " * " + b + " = " + p);
      System.out.println("Division: " + a + " / " + b + " = " + q);
      System.out.println("Remainder: " + a + " % " + b + " = " + r);
   }
}