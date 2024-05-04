package section1_3;

/*
 * Este programa usa Math.random() para simular um 
 * lançamento de moeda justo. Cada vez que você o 
 * executa, ele imprime Cara ou Coroa. Uma sequência 
 * de lançamentos terá muitas das mesmas propriedades 
 * de uma sequência que você obteria ao lançar uma 
 * moeda honesta, mas não é uma sequência 
 * verdadeiramente aleatória.
 */
public class CaraOuCoroa01 {
   public static void main(String[] args) {
      // Simulate a fair coin flip.
      if (Math.random() < 0.5)
         System.out.println("Cara");
      else
         System.out.println("Coroa");
   }
}
