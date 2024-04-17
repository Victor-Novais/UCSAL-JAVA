import java.util.Scanner;
public class Atividade_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int mmc = calcularMMC(num1, num2);

        System.out.println("O MMC de " + num1 + " e " + num2 + " é: " + mmc);
    }

    public static int calcularMMC(int num1, int num2) {
        int mmc = (num1 * num2) / calcularMDC(num1, num2);
        return main;
    }

    public static int calcularMDC(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
