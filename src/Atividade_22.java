import java.util.Random;
import java.util.Scanner;

public class Atividade_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhasA = lerDimensao(scanner, "A", "linhas");
        int colunasA = lerDimensao(scanner, "A", "colunas");
        int linhasB = lerDimensao(scanner, "B", "linhas");
        int colunasB = lerDimensao(scanner, "B", "colunas");

        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar a matriz A pela matriz B.");
            return;
        }

        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];

        System.out.println("Preenchendo a matriz A com valores aleatórios:");
        preencherMatrizComRandomicos(matrizA);

        System.out.println("Preenchendo a matriz B com valores aleatórios:");
        preencherMatrizComRandomicos(matrizB);

        int[][] matrizC = multiplicarMatrizes(matrizA, matrizB);

        System.out.println("Matriz resultante da multiplicação (A x B):");
        exibirMatriz(matrizC);

        scanner.close();
    }

    public static int lerDimensao(Scanner scanner, String matrizNome, String dimensaoNome) {
        int dimensao;
        do {
            System.out.printf("Digite o número de %s da matriz %s (máximo 20):%n", dimensaoNome, matrizNome);
            dimensao = scanner.nextInt();
            if (dimensao < 1 || dimensao > 20) {
                System.out.println("Dimensão inválida. Digite um valor entre 1 e 20.");
            }
        } while (dimensao < 1 || dimensao > 20);
        return dimensao;
    }

    public static void preencherMatrizComRandomicos(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;
        int[][] matrizC = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizC[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return matrizC;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
