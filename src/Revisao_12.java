import java.util.Scanner;

public class Revisao_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0, quantidade = 0, somaPares = 0, quantidadePares = 0;
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número positivo (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
            quantidade++;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            }
        }

        double media = (quantidade > 0) ? (double) soma / quantidade : 0;
        double mediaPares = (quantidadePares > 0) ? (double) somaPares / quantidadePares : 0;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Quantidade de números: " + quantidade);
        System.out.println("Média dos números: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média dos números pares: " + mediaPares);
    }
}
