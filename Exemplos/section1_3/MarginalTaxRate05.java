package section1_3;

public class MarginalTaxRate05 {
   public static void main(String[] args) {
      // recebe o valor a pagar
      int income = Integer.parseInt(args[0]);
      // calcula a taxa sobre o valor a pagar
      double rate = 0.0;

      // condições
      if (income < 0)
         rate = 0.0;
      else if (income < 8925)
         rate = 0.10;
      else if (income < 36250)
         rate = 0.15;
      else if (income < 87850)
         rate = 0.23;
      else if (income < 183250)
         rate = 0.28;
      else if (income < 398350)
         rate = 0.33;
      else if (income < 400000)
         rate = 0.35;
      else
         rate = 0.396;

      System.out.println("marginal tax rate: " + rate);
   } // end main
} // end class
