package sessao1_2;

/*
 * 1.2.3 Suponha que a e b sejam 
 * variáveis booleanas. Mostre que a 
 * expressão (!(a && b) && (a || b)) || 
 * ((a && b) || !(a || b)) é avaliado 
 * como verdadeiro.
 */
public class Exe02 {
   /**
    * @param args
    */
   public static void main(String[] args) {
      // declare variable boolean true
      boolean a = true, b = true;
      boolean exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
      // display
      System.out.println("boolean a = true, b = a;");
      System.out.println("boolean exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));");
      System.out.println("Sendo a e b verdadeiros  resultado: " + exps);

      // a = true and b = false
      a = true;
      b = false;
      exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
      // display
      System.out.println("\nboolean a = true, b = false;");
      System.out.println("boolean exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));");
      System.out.println("Sendo a verdadeiro e b false  resultado: " + exps);

      // a false and b true
      a = false;
      b = true;
      exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
      // display
      System.out.println("\nboolean a = false, b = true;");
      System.out.println("boolean exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));");
      System.out.println("Sendo a false e b verdadeiro  resultado: " + exps);

      // a = false and b = false
      a = false;
      b = false;
      exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
      // display
      System.out.println("\nboolean a = false, b = false;");
      System.out.println("boolean exps = (!(a && b) && (a || b)) || ((a && b) || !(a || b));");
      System.out.println("Sendo a false e b false  resultado: " + exps);
   } // final
} // final classe