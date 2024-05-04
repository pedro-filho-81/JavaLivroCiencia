package sessao1_2;

import java.util.Scanner; // para entrada de dados.

/*
 * 1.2.14 Escreva um programa que receba dois números 
 * inteiros positivos como argumentos de linha de 
 * comando e imprima verdadeiro se um deles dividir o 
 * outro igualmente.
 */
public class Exe14 {
   public static void main(String[] args) {
      // cria o objeto input
      Scanner input = new Scanner(System.in);

      // entrada de dados
      System.out.println("Digite o primeiro valor: ");
      int n1 = input.nextInt(); // entre com um inteiro

      System.out.println("Segundo valor: ");
      int n2 = input.nextInt(); // outro inteiro

      // calcular
      boolean divide1 = (n1 % n2) == 0;
      boolean divide2 = (n2 % n1) == 0;

      // display
      System.out.println(n1 + " é divisivel por " + n2 + "? " + divide1);
      System.out.println(n2 + " é divisivel por " + n1 + "? " + divide2);
   }
}
