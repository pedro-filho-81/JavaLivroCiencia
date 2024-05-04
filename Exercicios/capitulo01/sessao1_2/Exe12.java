package sessao1_2;

/*
 * 1.2.12 Descreva o que acontece se 
 * você escrever sqrt em vez de Math.
 * sqrt no PROGRAMA 1.2.3. 1.2.13 Avalie 
 * a expressão (Math.sqrt(2) * Math.sqrt
 * (2) == 2).
 */
public class Exe12 {
   public static void main(String[] args) {
      /*
       * (sqrt(2) * sqrt(2))
       * Exceção no thread "principal" java.lang.
       * Exceção de operação não suportada:
       * Método não implementado 'sqrt'
       * em sessão1_2.Exe12.sqrt(Exe12.java:20)
       * em sessão1_2.Exe12.main(Exe12.java:13)
       */
      // variable
      float valor = (sqrt(2) * sqrt(2));
      /*
       * (sqrt(2) * sqrt(2)); gera o erro abaixo
       * Exceção no thread "principal" java.lang.
       * Exceção de operação não suportada:
       * Método não implementado 'sqrt'
       * em sessão1_2.Exe12.sqrt(Exe12.java:35)
       * em sessão1_2.Exe12.main(Exe12.java:20)
       */
      // display
      System.out.println("O valor da rais quadrada é: " + valor);
   }

   private static int sqrt(int i) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'sqrt'");
   }
}
