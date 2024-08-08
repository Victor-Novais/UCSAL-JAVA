import java.util.Scanner;

public class Revisao_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Informe o valor de n: ");
        int n = scan.nextInt();


        if (n <= 0) {
            System.out.println("n deve ser maior que zero.");
            return;
        }


        double s1 = 0.0;
        for (int i = 1; i <= n; i++) {
            s1 += 1.0 / i;
        }
        System.out.printf("a) S = %.5f%n", s1);


        double s2 = 0.0;
        for (int i = 1; i <= n; i++) {
            s2 += (double) i / (n - i + 1);
        }
        System.out.printf("b) S = %.5f%n", s2);


        double s3 = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s3 -= 1.0 / i;
            } else {
                s3 += 1.0 / i;
            }
        }
        System.out.printf("c) S = %.5f%n", s3);
    }
}
