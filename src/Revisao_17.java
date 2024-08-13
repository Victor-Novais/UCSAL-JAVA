import java.util.Scanner;

public class Revisao_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[50];
        int maiorValor = Integer.MIN_VALUE;
        int posicaoMaiorValor = -1;


        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();

            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println("\nO maior valor é " + maiorValor + " e está na posição " + (posicaoMaiorValor + 1) + ".");

        scanner.close();
    }
}
