import java.util.Scanner;

public class DeputadoCandidatos {


    static class Candidato {
        String cadastro;
        int partido;
        int votos;

        Candidato(String cadastro, int partido, int votos) {
            this.cadastro = cadastro;
            this.partido = partido;
            this.votos = votos;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCandidatos = 20;
        Candidato[] candidatos = new Candidato[numCandidatos];


        for (int i = 0; i < numCandidatos; i++) {
            System.out.println("Digite o cadastro do candidato " + (i + 1) + ":");
            String cadastro = scanner.next();

            int partido;
            do {
                System.out.println("Digite o partido do candidato " + (i + 1) + " (inteiro entre 1 e 10):");
                partido = scanner.nextInt();
            } while (partido < 1 || partido > 10);

            System.out.println("Digite o número de votos do candidato " + (i + 1) + ":");
            int votos = scanner.nextInt();

            candidatos[i] = new Candidato(cadastro, partido, votos);
        }


        Candidato[] maisVotadosPorPartido = new Candidato[10];


        for (Candidato candidato : candidatos) {
            int partidoIndex = candidato.partido - 1;
            if (maisVotadosPorPartido[partidoIndex] == null || candidato.votos > maisVotadosPorPartido[partidoIndex].votos) {
                maisVotadosPorPartido[partidoIndex] = candidato;
            }
        }


        System.out.println("Candidatos mais votados por partido:");
        for (int i = 0; i < 10; i++) {
            if (maisVotadosPorPartido[i] != null) {
                System.out.println("Partido " + (i + 1) + ":");
                System.out.println("Cadastro: " + maisVotadosPorPartido[i].cadastro);
                System.out.println("Votos: " + maisVotadosPorPartido[i].votos);
                System.out.println();
            }
        }

        scanner.close();
    }
}
