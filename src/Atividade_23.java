import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Atividade_23 {
    public static void main(String[] args) {
        int[][] matrizA = new int[100][100];
        int[][] matrizB = new int[10000][2];


        preencherMatrizComRandomicos(matrizA);


        contarFrequenciaValores(matrizA, matrizB);


        exibirFrequenciaValores(matrizB);
    }

    public static void preencherMatrizComRandomicos(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10000);
            }
        }
    }

    public static void contarFrequenciaValores(int[][] matrizA, int[][] matrizB) {
        Map<Integer, Integer> frequenciaMap = new HashMap<>();


        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                int valor = matrizA[i][j];
                frequenciaMap.put(valor, frequenciaMap.getOrDefault(valor, 0) + 1);
            }
        }

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : frequenciaMap.entrySet()) {
            matrizB[index][0] = entry.getKey();
            matrizB[index][1] = entry.getValue();
            index++;
        }
    }

    public static void exibirFrequenciaValores(int[][] matrizB) {
        System.out.println("Valor - Frequência");
        for (int i = 0; i < matrizB.length; i++) {
            if (matrizB[i][1] > 0) {
                System.out.println(matrizB[i][0] + " - " + matrizB[i][1]);
            }
        }
    }
}
