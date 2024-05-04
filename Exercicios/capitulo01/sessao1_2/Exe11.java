package sessao1_2;

/*
 * 1.2.11 Suponha que uma variável a seja declarada 
 * como double a = 3,14159. O que cada um dos itens a 
 * seguir imprime? O. System.out.println(a); B. 
 * System.out.println(a+1); c. System.out.println(8/
 * (int)a); d. System.out.println(8/a); Isso é. 
 * System.out.println((int)(8/a)); Explique cada 
 * resultado.
 */
public class Exe11 {
   public static void main(String[] args) {
      // variable
      double a = 3.14159;

      // display
      System.out.println(a); // resultado 3,14159, exibe o valor de a
      System.out.println(a + 1); // resultado 4,14159 soma o inteiro de a mais 1
      System.out.println(8 / (int) a); // resultado 2, divide o inteiro 8 pelo typecast (int) a que é 3.
      System.out.println(8 / a); // resultado 2.5464812403910124; divisão de 8 inteiros e a variável double a
      System.out.println((int) (8 / a)); // resultado = 2; o typecast (int) converte a divisão de 8 pelo inteiro a 3
   }
}
