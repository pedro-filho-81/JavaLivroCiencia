package sessao1_2;

/*
 * 1.2.4 Suponha que a e b sejam 
 * variáveis int. Simplifique a seguinte 
 * expressão: (!(a < b) && !(a > b)).
 */
public class Exe04 {
   public static void main(String[] args) {
      // declare variable boolean true
      int a = 5, b = 2;
      boolean exps = (!(a < b) && !(a > b));
      // display
      System.out.println("int a = 5, b = 2;");
      System.out.println("boolean exps = (!(a < b) && !(a > b));");
      System.out.println("Resultado = " + exps);

      // a = true and b = false
      a = 5;
      b = 5;
      exps = (!(a < b) && !(a > b));
      // display
      System.out.println("\nint a = 5, b = 5;");
      System.out.println("boolean exps = (!(a < b) && !(a > b));;");
      System.out.println("Resultado = " + exps);

      // a false and b true
      a = 2;
      b = 5;
      exps = (!(a < b) && !(a > b));
      ;
      // display
      System.out.println("\nint a = 2, b = 5;");
      System.out.println("boolean exps = (!(a < b) && !(a > b));;");
      System.out.println("Sendo a 2 e b 5, resultado: " + exps);

      // a = false and b = false
      a = 5;
      b = 4;
      exps = (!(a < b) && !(a > b));
      ;
      // display
      System.out.println("\nint a = 5, b = 4;");
      System.out.println("boolean exps = (!(a < b) && !(a > b));;");
      System.out.println("Sendo a 5 e b 4 resultado: " + exps);
   }
}