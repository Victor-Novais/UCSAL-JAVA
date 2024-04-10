import java.util.Scanner;

public class Aividade_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalIdadeTerror = 0;
        int totalPessoasTerror = 0;
        int totalHomensAcao = 0;
        int totalPessoasComediaHomem = 0;
        int totalPessoasComediaMulher = 0;
        int totalPessoas = 0;
        int totalIdade = 0;

        System.out.println("Digite os dados dos frequentadores do cinema:");

        while (true) {
            System.out.print("Idade (ou -1 para sair): ");
            int idade = sc.nextInt();
            if (idade == -1) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);

            System.out.print("Preferência de gênero (Comédia/Terror/Ação): ");
            String preferencia = sc.next();

            if (preferencia.equalsIgnoreCase("Terror")) {
                totalIdadeTerror += idade;
                totalPessoasTerror++;
            }

            if (sexo == 'M' && preferencia.equalsIgnoreCase("Ação")) {
                totalHomensAcao++;
            }

            if (preferencia.equalsIgnoreCase("Comédia")) {
                if (sexo == 'M') {
                    totalPessoasComediaHomem++;
                } else {
                    totalPessoasComediaMulher++;
                }
            }

            totalIdade += idade;
            totalPessoas++;
        }
        sc.close();


        double mediaIdadeTerror = totalPessoasTerror > 0 ? (double) totalIdadeTerror / totalPessoasTerror : 0;
        System.out.println("a) Média de idade das pessoas que preferem filmes de terror: " + mediaIdadeTerror);


        double percentualHomensAcao = totalHomensAcao * 100.0 / totalPessoas;
        System.out.println("b) Percentual de homens que preferem filmes de ação: " + percentualHomensAcao + "%");


        String preferenciaComedia = totalPessoasComediaHomem > totalPessoasComediaMulher ? "homens" :
                (totalPessoasComediaHomem < totalPessoasComediaMulher ? "mulheres" : "empate");
        System.out.println("c) Mais " + preferenciaComedia + " preferem os filmes de comédia.");


        double mediaIdade = totalPessoas > 0 ? (double) totalIdade / totalPessoas : 0;
        System.out.println("d) Faixa etária dos frequentadores: Média de idade " + mediaIdade);

    }
}
