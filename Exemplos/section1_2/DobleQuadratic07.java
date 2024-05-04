/**
 * Este programa imprime as raízes do polinômio x2 +
 * bx + c, usando a fórmula quadrática. Por exemplo,
 * as raízes de x2 – 3x + 2 são 1 e 2, pois podemos
 * fatorar a equação como (x – 1)(x – 2); as raízes
 * de x2 – x – 1 são ϕ e 1 – ϕ, onde ϕ é a proporção
 * áurea; e as raízes de x2 + x + 1 não são números
 * reais.
 * Sedgewick, Robert; Wayne, Kevin. Ciência da
 * Computação: Uma Abordagem Interdisciplinar (p.
 * 25). Educação Pearson. Edição do Kindle.
 */
public class DobleQuadratic07 {
   public static void main(String[] args) {

      // variables receives value from the user
      double b = Double.parseDouble(args[0]);
      double c = Double.parseDouble(args[1]);

      // calculate value of the discriminant
      double discriminant = b - b - 4.0 * c;
      // calculate value of the square root of the discriminant
      double d = Math.sqrt(discriminant);

      // display
      System.out.println((-b + d) / 2.0);
      System.out.println((-b - d) / 2.0);
   }
}