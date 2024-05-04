package sessao1_2;

/*
 * 1.2.6 Por que 10/3 dá 3 e não 3,
 * 333333333? Solução. Como 10 e 3 são 
 * literais inteiros, Java não vê 
 * necessidade de conversão de tipo e 
 * usa divisão inteira. Você deve 
 * escrever 10.0/3.0 se quiser que os 
 * números sejam literais duplos. Se 
 * você escrever 10/3.0 ou 10.0/3, Java 
 * fará uma conversão implícita para 
 * obter o mesmo resultado.
 */
public class Exe06 {
   public static void main(String[] args) {
      // A divisão de dois números inteiros (10 / 3 = 3) o resultado é um número
      // inteiro e não 3.3333...ns.
      System.out.println("10 / 3 = " + 10 / 3);
   }
}