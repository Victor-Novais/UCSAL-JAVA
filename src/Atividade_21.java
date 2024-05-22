public class Atividade_21 {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        mostrarSoma(matriz);
    }

    public static void mostrarSoma(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma dos elementos da linha " + (i + 1) + ": " + soma);
        }
    }
}
