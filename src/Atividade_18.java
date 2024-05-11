import java.util.Scanner;

public class Atividade_18 {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int[] vetor = new int[20];


            System.out.println("Digite os números positivos para preencher o vetor (digite 0 para parar):");
            int numero;
            int indice = 0;
            do {
                numero = scanner.nextInt();
                if (numero > 0 && indice < 20) {
                    vetor[indice] = numero;
                    indice++;
                }
            } while (numero != 0 && indice < 20);


            System.out.println("Vetor original:");
            for (int i = 0; i < indice; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();


            System.out.println("Digite o número a ser removido:");
            int numeroRemover = scanner.nextInt();


            int novoTamanho = removeNumero(vetor, indice, numeroRemover);

            System.out.println("Vetor modificado:");
            for (int i = 0; i < novoTamanho; i++) {
                System.out.print(vetor[i] + " ");
            }
        }

        // Aq vai  remover tds as ocorrências do número
        public static int removeNumero(int[] vetor, int tamanho, int numero) {
            int j = 0;
            for (int i = 0; i < tamanho; i++) {
                if (vetor[i] != numero) {
                    vetor[j] = vetor[i];
                    j++;
                }
            }
            return j;
        }
    }
}
