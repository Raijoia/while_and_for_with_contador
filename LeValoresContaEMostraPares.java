import java.util.Scanner;

public class LeValoresContaEMostraPares {
  public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite seus valores, quando quiser parar digite 0: ");
    int valor = scanner.nextInt();
    int soma = 0;
    int cont = 0;
    int par;

    while (valor != 0) {
      par = valor;
      if (par % 2 == 0) {
        cont++;
      }
      soma = soma + valor;
      System.out.print("Digite o proximo numero: ");
      valor = scanner.nextInt();
    }

    if (cont == 0) {
      System.out.println("Nenhum valor foi digitado");
    } else if (cont > 1) {
      System.out.println("A soma entre todos os valores é: " + soma);
      System.out.println("Tem " + cont + " numeros pares");
    } else {
      System.out.println("A soma entre todos os valores é: " + soma);
      System.out.println("Tem " + cont + " numero par");
    }

    

    scanner.close();
  }
}