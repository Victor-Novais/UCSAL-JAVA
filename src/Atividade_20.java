public class Atividade_20 {
        public static void main(String[] args) {
            int linhas = 4;
            int colunas = 5;

            int[][] matriz = new int[linhas][colunas];
            preencherMatriz(matriz);


            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void preencherMatriz(int[][] matriz) {
            int totalElementos = matriz.length * matriz[0].length;
            int[] fibonacci = gerarSequencia(totalElementos);
            int k = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = fibonacci[k];
                    k++;
                }
            }
        }

        public static int[] gerarSequencia(int n) {
            int[] fibonacci = new int[n];
            if (n > 0) {
                fibonacci[0] = 0;
            }
            if (n > 1) {
                fibonacci[1] = 1;
            }
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            return fibonacci;
        }
    }

