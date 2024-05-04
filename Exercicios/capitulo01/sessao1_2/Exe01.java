package sessao1_2;

/*
   1.2.1 Suponha que a e b sejam variáveis int. O que a seguinte sequência de declarações faz? int t = uma; b =t; uma =b;
*/

class Exe01 {
   public static void main(String[] args) {
      // declare variabel
      int t, b, a = 1;
      t = a;
      b = a;
      a = t;

      System.out.println("int a = 1, t = a, b = a;");
      System.out.println("Todos os valores são iguais a ( a ).");
      System.out.println("o valor de t = " + t + " e b = " + b + "\n");
   }
}