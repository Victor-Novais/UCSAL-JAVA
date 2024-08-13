import java.util.Scanner;

public class Revisao_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];




        System.out.println("Matriz resultante:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }


    public static void preencherMatriz(int[][] matriz, int linhas, int colunas) {
        int valor = 1;

        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
    }
}
