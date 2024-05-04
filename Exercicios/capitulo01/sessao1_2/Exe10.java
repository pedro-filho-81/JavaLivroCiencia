package sessao1_2;

/*
 * 1.2.10 Suponha que uma variável a seja declarada como int a = 2147483647 (ou equivalentemente, Integer.MAX_VALUE). O que cada um dos itens a seguir imprime? O. System.out.println(a); B. System.out.println(a+1); c. System.out.println(2-a); d. System.out.println(-2-a); Isso é. System.out.println(2*a); f. System.out.println(4*a); Explique cada resultado.
 */
public class Exe10 {
   public static void main(String[] args) {
      int a = 2147483647;
      // exebe
      System.out.println(a); // 2147483647 valor limite para inteiros
      System.out.println(a + 1); // -2147483648 valor negativo porque estourou o valor limite para inteiros
      System.out.println(2 - a); // -2147483645 positivo mais negativo = valor negativo
      System.out.println(-2 - a); // 2147483647 negativo com negativo gera um valor psoitivo
      System.out.println(2 * a); // -2 2 vezes o valor limite gera um valor negativo
      System.out.println(4 * a); // -4 4 vezes o valor limite gera um valor negativo
   }
}