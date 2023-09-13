import java.util.Scanner;

public class ContaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o menor numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o maior numero: ");
        int numero2 = scanner.nextInt();
        int cont = numero1;
        
        while (cont <= numero2) {
            System.out.print(cont + " ");
            cont = cont + 1;
        }
        
        scanner.close();
    }
}
