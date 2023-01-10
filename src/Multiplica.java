import java.util.Scanner;

public class Multiplica {
    public static void main(String[] args) {
      //Escreva um código que deve imprimir a tabela de multiplicação desse algum número fornecido, e deve exibir um cabeçalho com o nome Tabela de multiplicação de X, onde X é o número a ser multiplicado.
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um número: ");
      int número = sc.nextInt();

      System.out.println("Tabela de multiplicação de " + número + ": ");
      for (int i = 1; i <= 10; i++) {
        System.out.println(número + " x " + i + " = " + (número * i));
      }
      sc.close();
    }
}
