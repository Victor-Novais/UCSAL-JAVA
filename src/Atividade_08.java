
import java.util.Scanner;
public class Atividade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int somaPares = 0;
        int quantidadePares = 0;

        while (true) {
            System.out.print("Digite um número positivo (ou um número negativo para parar): ");
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

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Soma dos números digitados: " + soma);
            System.out.println("Quantidade de números digitados: " + quantidade);
            System.out.println("Média dos números digitados: " + media);
            System.out.println("Maior número digitado: " + maior);
            System.out.println("Menor número digitado: " + menor);

            if (quantidadePares > 0) {
                double mediaPares = (double) somaPares / quantidadePares;
                System.out.println("Média dos números pares: " + mediaPares);
            } else {
                System.out.println("Não foram digitados números pares.");
            }
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}
