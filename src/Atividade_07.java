import java.util.Scanner;
public class Atividade_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        int tipoOperacao;
        double valor;
        while (true) {
            System.out.print("Digite o tipo de operação (1.Depósito 2.Retirada 3.Fim): ");
            tipoOperacao = scanner.nextInt();

            if (tipoOperacao == 3) {
                break;
            }

            System.out.print("Digite o valor da operação: ");
            valor = scanner.nextDouble();

            switch (tipoOperacao) {
                case 1:
                    saldo += valor;
                    break;
                case 2:
                    saldo -= valor;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();

        System.out.println("Saldo final da conta de " + nomeCliente + ": " + saldo);

        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
    }
}
