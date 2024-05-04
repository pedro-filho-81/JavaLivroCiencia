package sessao1_2;

/*
 * 1.2.9 O que cada um dos itens a 
 * seguir imprime? a. System.out.println('b'); b. 
 * System.out.println('b' + 'c'); c. System.out.
 * println((char) ('a' + 4)); 
 * Explique cada resultado.
 */
public class Exe09 {
   public static void main(String[] args) {
      // exibe caracteres no java todo valor envolvido dentro de aspas simples são
      // caracteres
      System.out.println('b'); // exibe a letra b
      System.out.println('b' + 'c'); // exibe a letra b concatenada com a letre c
      System.out.println((char) ('a' + 4)); // o (char) é exemplo de conversão de tipo, converte dodos os valores em
      // caracteres exibe o número 4
   }
}
