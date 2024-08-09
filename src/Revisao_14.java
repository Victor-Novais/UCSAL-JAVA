import java.util.Scanner;

public class Revisao_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {
            if (ehPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
