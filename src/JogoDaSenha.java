import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JogoDaSenha {
    private static final int TAMANHO_SENHA = 4;
    private int[] senhaSecreta;

    public JogoDaSenha() {
        senhaSecreta = gerarSenhaAleatoria();
    }

    // Gera a senha secreta aleatória de 1 a 6
    private int[] gerarSenhaAleatoria() {
        Random rd = new Random();
        int[] senha = new int[TAMANHO_SENHA];
        for (int i = 0; i < senha.length; i++) {
            senha[i] = rd.nextInt(6) + 1; // Gera números de 1 a 6
        }
        return senha;
    }

    // Método para verificar a tentativa do jogador
    public int[] verificarTentativa(int[] tentativa) {
        int[] resultado = new int[2];
        boolean[] marcadosSenha = new boolean[TAMANHO_SENHA];
        boolean[] marcadosTentativa = new boolean[TAMANHO_SENHA];

        // Verifica acertos na posição correta
        for (int i = 0; i < TAMANHO_SENHA; i++) {
            if (senhaSecreta[i] == tentativa[i]) {
                resultado[0]++;
                marcadosSenha[i] = true;
                marcadosTentativa[i] = true;
            }
        }

        // Verifica acertos em posições erradas
        for (int i = 0; i < TAMANHO_SENHA; i++) {
            if (!marcadosTentativa[i]) {
                for (int j = 0; j < TAMANHO_SENHA; j++) {
                    if (!marcadosSenha[j] && senhaSecreta[j] == tentativa[i]) {
                        resultado[1]++;
                        marcadosSenha[j] = true;
                        marcadosTentativa[i] = true;
                        break;
                    }
                }
            }
        }
        return resultado;
    }

    // Método para imprimir o resultado da tentativa
    public void imprimirResultadoTentativa(int[] resultado) {
        System.out.println("Corretos na posição correta: " + resultado[0]);
        System.out.println("Corretos em posição equivocada: " + resultado[1]);
    }

    // Método para receber a tentativa do jogador
    public int[] receberTentativaJogador(Scanner scanner) {
        int[] tentativa = new int[TAMANHO_SENHA];
        System.out.println("Digite sua tentativa (4 números de 1 a 6, separados por espaço):");

        while (true) {
            try {
                for (int i = 0; i < TAMANHO_SENHA; i++) {
                    tentativa[i] = scanner.nextInt();
                    if (tentativa[i] < 1 || tentativa[i] > 6) {
                        throw new IllegalArgumentException("Todos os números devem estar entre 1 e 6.");
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira quatro números entre 1 e 6:");
                scanner.nextLine();
            }
        }
        return tentativa;
    }

    // Método para definir o número de tentativas
    private int definirNumeroTentativas(Scanner scanner) {
        System.out.println("Digite o número de tentativas (máximo 10):");
        int tentativas = scanner.nextInt();

        while (tentativas <= 0 || tentativas > 10) {
            System.out.println("Valor inválido! Digite um número entre 1 e 10:");
            tentativas = scanner.nextInt();
        }
        return tentativas;
    }

    // Método para controlar o fluxo do jogo
    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        int tentativasRestantes = definirNumeroTentativas(scanner);

        while (tentativasRestantes > 0) {
            int[] tentativaJogador = receberTentativaJogador(scanner);
            int[] resultado = verificarTentativa(tentativaJogador);

            imprimirResultadoTentativa(resultado);

            if (resultado[0] == TAMANHO_SENHA) {
                System.out.println("Parabéns! Você acertou a senha!");
                break;
            }

            tentativasRestantes--;
            System.out.println("Tentativas restantes: " + tentativasRestantes);
        }

        if (tentativasRestantes == 0) {
            System.out.println("Você perdeu! A senha era: " + Arrays.toString(senhaSecreta));
        }
        scanner.close();
    }

    public static void main(String[] args) {
        JogoDaSenha jogo = new JogoDaSenha();
        jogo.iniciarJogo();
    }
}
