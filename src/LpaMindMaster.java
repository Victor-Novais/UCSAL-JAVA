import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class LpaMindMaster {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        int[] numerosAleat = new int[4];
        for (int i = 0; i < 4; i++) {
            numerosAleat[i] = random.nextInt(6) + 1;
        }

        int[] numerosDig = new int[4];
        boolean venceu = false;

        System.out.println("Bem-vindo ao jogo da senha!");


        for (int tentativa = 1; tentativa <= 10; tentativa++) {
            System.out.println("Tentativa " + tentativa + ":");


            for (int i = 0; i < 4; ) {
                System.out.println("Digite o número " + (i + 1) + " da senha (entre 1 e 6):");
                int num = scan.nextInt();
                if (1 <= num && num <= 6) {
                    numerosDig[i] = num;
                    i++;
                } else {
                    System.out.println("Número inválido. Tente novamente, o número deve estar entre 1 e 6.");
                }
            }


            int posicaoCorreta = 0;
            int corCorretaPosicaoErrada = 0;

            boolean[] senhaUsada = new boolean[4];
            boolean[] tentativaUsada = new boolean[4];


            for (int i = 0; i < 4; i++) {
                if (numerosDig[i] == numerosAleat[i]) {
                    posicaoCorreta++;
                    senhaUsada[i] = true;
                    tentativaUsada[i] = true;
                }
            }


            for (int i = 0; i < 4; i++) {
                if (!tentativaUsada[i]) {
                    for (int j = 0; j < 4; j++) {
                        if (!senhaUsada[j] && numerosDig[i] == numerosAleat[j]) {
                            corCorretaPosicaoErrada++;
                            senhaUsada[j] = true;
                            break;
                        }
                    }
                }
            }


            System.out.println("Números na posição correta: " + posicaoCorreta);
            System.out.println("Números corretos em posição errada: " + corCorretaPosicaoErrada);


            if (posicaoCorreta == 4) {
                venceu = true;
                break;
            }
        }


        if (venceu) {
            System.out.println("Parabéns, você venceu!");
        } else {
            System.out.println("Você perdeu. A senha correta era: " + Arrays.toString(numerosAleat));
        }

        scan.close();
    }
}
