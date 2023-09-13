import java.util.Scanner;

public interface LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seus numeros, caso queria parar digite 0: ");
        int numero = scanner.nextInt();
        int soma = 0;
        int cont = 0;
        double media;
        
        while (numero != 0) {
            soma = soma + numero;
            System.out.print("Próximo: ");
            numero = scanner.nextInt();
            cont++;
        }
        
        if(cont == 0) {
            System.out.println("Nenhum valor foi digitado!");
        } else {
            // (double) faz o numero int virar um numero double, apenas um double ja basta para a operação ficar totalmente em double
            media = (double)soma / cont;
            System.out.println("A media entre os valores é: " + media);
            System.out.println("A soma de todos os valores é: " + soma);
        }

        System.out.println("Laço encerrado");

        scanner.close();

    }
}
