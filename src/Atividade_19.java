import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Atividade_19 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> sequencia = new ArrayList<>();
            HashSet<Integer> semRepeticao = new HashSet<>();

            System.out.println("Digite até 20 números inteiros e positivos (digite um número negativo para parar):");

            for (int i = 0; i < 20; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int num = scanner.nextInt();
                if (num < 0) {
                    break;
                }
                sequencia.add(num);
                semRepeticao.add(num);
            }

            scanner.close();

            System.out.println("Sequência original: " + sequencia);
            System.out.println("Sequência sem repetições: " + new ArrayList<>(semRepeticao));
        }
    }
