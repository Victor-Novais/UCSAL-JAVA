import java.util.Scanner;

public class Revisao_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (ehFibonacci(num)) {
            System.out.println(num + " é um termo da sequência de Fibonacci.");
        } else {
            System.out.println(num + " não é um termo da sequência de Fibonacci.");
        }
    }

    public static boolean ehFibonacci(int num) {
        if (num == 1) {
            return true;
        }

        int a = 1, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == num;
    }}
