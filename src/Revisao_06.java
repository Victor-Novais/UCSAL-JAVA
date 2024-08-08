import java.util.Scanner;

public class Revisao_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Informe o número de maçãs compradas: ");
        int numMacas = scan.nextInt();


        double valorTotal;


        if (numMacas < 12) {
            valorTotal = numMacas * 0.30;
        } else {
            valorTotal = numMacas * 0.25;
        }


        System.out.printf("O valor total da compra é: R$ %.2f%n", valorTotal);
    }
}
