import java.util.Scanner;

public class Revisao_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        while (true) {

            System.out.println("Escolha a operação: 1.Depósito 2.Retirada 3.Fim");
            int tipoOperacao = scanner.nextInt();


            if (tipoOperacao == 3) {
                break;
            }


            System.out.print("Digite o valor da operação: ");
            double valorOperacao = scanner.nextDouble();


            if (tipoOperacao == 1) {
                saldo += valorOperacao;
            } else if (tipoOperacao == 2) {
                saldo -= valorOperacao;
            } else {
                System.out.println("Operação inválida. Tente novamente.");
            }
        }


        System.out.printf("Saldo final: R$ %.2f%n", saldo);
        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
    }
}
