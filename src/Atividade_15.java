import java.util.Scanner;

public class Atividade_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero.");
        int n = sc.nextInt();

        int resultado = fibonacci(n);
        System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + resultado);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
