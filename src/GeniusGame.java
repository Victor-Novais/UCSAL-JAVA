
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class GeniusGame {
        private static final Scanner scanner = new Scanner(System.in);
        private static final Random random = new Random();

        private List<Integer> sequence = new ArrayList<>();
        private int level = 1;

        public static void main(String[] args) {
            GeniusGame game = new GeniusGame();
            game.startGame();
        }

        public void startGame() {
            System.out.println("Bem-vindo ao jogo Gênius!");

            while (true) {
                if (sequence.size() == 10) {
                    level++;
                    sequence.clear();
                    System.out.println("Parabéns! Você avançou para o nível " + level);
                }

                addNumberToSequence();
                displaySequence();
                if (!getUserInputAndCheck()) {
                    System.out.println("Você errou! Fim de jogo.");
                    break;
                }

                System.out.println("Você acertou! Próxima sequência:");
            }
        }

        private void addNumberToSequence() {
            int maxNumber = level * 3;
            int nextNumber = random.nextInt(maxNumber) + 1;
            sequence.add(nextNumber);
        }

        private void displaySequence() {
            System.out.println("Memorize a sequência:");
            for (int number : sequence) {
                System.out.print(number + " ");
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo para o jogador memorizar
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("\n");
            clearConsole();
        }

        private boolean getUserInputAndCheck() {
            System.out.println("Digite a sequência:");
            for (int number : sequence) {
                int userNumber = scanner.nextInt();
                if (userNumber != number) {
                    return false;
                }
            }
            return true;
        }

        private void clearConsole() {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

