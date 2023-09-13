import java.util.Scanner;

public class IntervaloRegressivo {
  public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o maior valor: ");
    int maiorValor = scanner.nextInt();
    System.out.print("Digite o menor valor: ");
    int menorValor = scanner.nextInt();

    while(maiorValor >= menorValor) {
      maiorValor--;
      System.out.print(maiorValor + " ");
    }
  }
}