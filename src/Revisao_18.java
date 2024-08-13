import java.util.Scanner;

public class Revisao_18 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Digite a ordem da matriz (n x n): ");
    int n = scanner.nextInt();

    int[][] matriz = new int[n][n];


    System.out.println("Digite os elementos da matriz:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matriz[i][j] = scanner.nextInt();
        }
    }


    if (ehMatrizPermutacao(matriz, n)) {
        System.out.println("A matriz é de permutação.");
    } else {
        System.out.println("A matriz NÃO é de permutação.");
    }

    scanner.close();
}


    public static boolean ehMatrizPermutacao(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            int contadorLinhas = 0;
            int contadorColunas = 0;

            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == 1) {
                    contadorLinhas++;
                }
                if (matriz[j][i] == 1) {
                    contadorColunas++;
                }

                if (matriz[i][j] != 0 && matriz[i][j] != 1) {
                    return false;
                }
            }
            if (contadorLinhas != 1 || contadorColunas != 1) {
                return false;
            }
        }
        return true;
    }
}
