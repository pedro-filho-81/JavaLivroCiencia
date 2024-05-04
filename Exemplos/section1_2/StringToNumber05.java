/**
 * StringToNumber05
 */
public class StringToNumber05 {

   public static void main(String[] args) {
      // variables
      // aqui converte uma String "1234" em um inteiro
      // a classe Intenger e o método parseInt transforma uma string em um número
      // inteiro
      int a = Integer.parseInt("1234");
      int b = 99; // var b recebe o valor 99
      int c = a + b; // var c recebe a soma de a e b

      // display
      System.out.println(a + " + " + b + " = " + c);
   }
}