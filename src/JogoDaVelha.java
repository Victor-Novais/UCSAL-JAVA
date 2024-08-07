

import java.util.Scanner;

public class JogoDaVelha {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] jogo = new String[3][3];

        String jogador = "O";

        int linha = 0, coluna = 0, rodada = 1;

        boolean resultado = false;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                jogo[i][j] = " ";

            }

        }

        tabuleiro(jogo);

        do {

            jogador = jogador.equals("X") ? "O" : "X";

            System.out.printf(" %d° RODADA\n Jogador: %s\n", rodada, jogador);

            boolean jogadaValida = false;

            do {
                System.out.println(" Qual a posição da linha você deseja jogar: (1 - 3)");
                linha = sc.nextInt();
                System.out.println(" Qual a posição da coluna você deseja jogar: (1 - 3)");
                coluna = sc.nextInt();

                jogadaValida = jogadas(jogo, jogador, linha, coluna);

                if (!jogadaValida) {
                    System.out.println("Posição ocupada. Tente novamente.");
                }
            } while (!jogadaValida);

            tabuleiro(jogo);

            resultado = resultado(jogo, jogador);

            if (!resultado && rodada == 9) {
                System.out.println("Empate!");
                break;
            }

            rodada++;

        } while (!resultado);

        if (resultado) {
            mensagemFinal(jogador);
        }

    }


    public static void tabuleiro(String[][] jogo) {

        System.out.println(" ");
        System.out.printf("  %s  |  %s  | %s  \n", jogo[0][0], jogo[0][1], jogo[0][2]);
        System.out.printf("-------------------\n");
        System.out.printf("  %s  |  %s  | %s  \n", jogo[1][0], jogo[1][1], jogo[1][2]);
        System.out.printf("-------------------\n");
        System.out.printf("  %s  |  %s  | %s  \n", jogo[2][0], jogo[2][1], jogo[2][2]);
        System.out.println(" ");

    }


    public static boolean jogadas(String[][] jogo, String jogador, int linha, int coluna) {

        if (jogo[linha - 1][coluna - 1].equals(" ")) {

            jogo[linha - 1][coluna - 1] = jogador;
            return true;

        } else {

            return false;

        }

    }


    public static boolean resultado(String[][] jogo, String jogador) {

        for (int i = 0; i < 3; i++) {

            if (!jogo[i][0].equals(" ") && jogo[i][0].equals(jogo[i][1]) && jogo[i][0].equals(jogo[i][2])) {

                return true;

            }

            if (!jogo[0][i].equals(" ") && jogo[0][i].equals(jogo[1][i]) && jogo[0][i].equals(jogo[2][i])) {

                return true;

            }

        }


        if (!jogo[0][0].equals(" ") && jogo[0][0].equals(jogo[1][1]) && jogo[0][0].equals(jogo[2][2])) {

            return true;

        }

        if (!jogo[0][2].equals(" ") && jogo[0][2].equals(jogo[1][1]) && jogo[0][2].equals(jogo[2][0])) {

            return true;

        }

        return false;

    }

    public static void mensagemFinal(String jogador) {

        System.out.printf("O jogador %s venceu!\n", jogador);

    }

}
