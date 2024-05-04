/**
 * Este programa usa o método Java Math.random() para
 * gerar um número aleatório r entre 0,0 (inclusivo)
 * e 1,0 (exclusivo); em seguida, multiplica r pelo
 * argumento da linha de comando n para obter um
 * número aleatório maior ou igual a 0 e menor que n;
 * em seguida, usa uma conversão para truncar o
 * resultado para um valor inteiro entre 0 e n-1.
 * Sedgewick, Robert; Wayne, Kevin. Ciência da
 * Computação: Uma Abordagem Interdisciplinar (p.
 * 34). Educação Pearson. Edição do Kindle.
 */
public class CastingRandomInt08 {
   public static void main(String[] args) {

      // variable n receive value from the user
      int n = Integer.parseInt(args[0]);

      // variable r receive value of the library Math.random()
      double r = Math.random();

      // calculate
      // variable value receive the values integers.
      // (int) casting the value in integer
      int value = (int) (n * r);

      // display
      System.out.println("O valor aleatorio é: " + value);
   }
}