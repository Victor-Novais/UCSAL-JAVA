import java.util.Scanner;
public class Revisao_08 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Informe o enquadramento do professor (Nível 1, 2 ou 3): ");
        int nivel = scan.nextInt();


        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();


        double valorHoraAula;


        if (nivel == 1) {
            valorHoraAula = 12.00;
        } else if (nivel == 2) {
            valorHoraAula = 17.00;
        } else if (nivel == 3) {
            valorHoraAula = 25.00;
        } else {
            System.out.println("Enquadramento inválido.");
            return;
        }


        double salario = valorHoraAula * horasTrabalhadas;

        System.out.printf("O salário do professor é: R$ %.2f%n", salario);
    }
}
