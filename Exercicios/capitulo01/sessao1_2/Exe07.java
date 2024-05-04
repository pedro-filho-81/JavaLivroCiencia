package sessao1_2;

/*
 * 1.2.7 O que cada um dos itens a seguir imprime? a. System.out.println(2 + "bc"); b. System.out.println(2 + 3 + "bc"); c. System.out.println((2+3) + "bc"); d. System.out.println("bc" + (2+3)); e. System.out.println("bc" + 2 + 3); Explique cada resultado.
 */
public class Exe07 {
   public static void main(String[] args) {
      // o java considera a concatenação do inteiro e a string quando o número vem
      // antes da string
      System.out.println(2 + "bc"); // 2bc int + string
      System.out.println(2 + 3 + "bc"); // 5bc soma os int e concatena a string
      System.out.println((2 + 3) + "bc"); // 5bc som os int e concatena a string
      System.out.println("bc" + (2 + 3)); // bc5 por causa dos parênteses a soma dos inteiros é feito primeiro, depois
                                          // concatena a string
      System.out.println("bc" + 2 + 3);
      /*
       * bc23 -> por causa da precedência da classe
       * String, todos os valores são
       * considerados Strings.
       */
   }
}