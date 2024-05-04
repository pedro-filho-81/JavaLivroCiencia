package sessao1_2;

/*
 * .2.5 O operador ou exclusivo ^ para 
 * operandos booleanos é definido como 
 * verdadeiro se forem diferentes, falso 
 * se forem iguais. Forneça uma tabela 
 * verdade para esta função.
 */
public class Exe05 {
   public static void main(String[] args) {
      int a = 5;
      int b = 2;
      boolean exep = (a != b);
      System.out.println("int a = 5;\nint b = 2;");
      System.out.println("No operador ^ ou exclusivo:");
      System.out.println("Se a diferente de b");
      System.out.println("Resultado = " + exep);
      System.out.println();

      // a diferente de b
      a = 2;
      b = 5;
      exep = (a != b);
      System.out.println("int a = 2;\nint b = 5;");
      System.out.println("No operador ^ ou exclusivo:");
      System.out.println("Se a diferente de b");
      System.out.println("Resultado = " + exep);
      System.out.println();

      // a igual a b
      a = 5;
      b = 5;
      exep = (a != b);
      System.out.println("int a = 5;\nint b = 5;");
      System.out.println("No operador ^ ou exclusivo:");
      System.out.println("Se a igual a b");
      System.out.println("Resultado = " + exep);
      System.out.println();
   }
}