import java.util.Scanner;

public class Revisao_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a ordem da matriz quadrada (n x n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else if (i < j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = -1;
                }
            }
        }


        System.out.println("Matriz resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
