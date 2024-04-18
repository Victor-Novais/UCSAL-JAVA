import java.util.Scanner;

public class Atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite qualquer numero.");
        int n = sc.nextInt();

        if (n > 0 ) {
            nPrimos(n);
        }else {
            System.out.println("Numero invalido, digite um numero positivo e maior que ZERO");
        }

    }

    public static void nPrimos(int n) {
        int count = 0;
        int a = 0;
        System.out.println("Entrou com " + n);

        for (int i = 2; a < n; i++) {
            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i);
                count += i;
                a++;
            }
        }

        System.out.println("O valor da soma dos " + n + " primeiros números primos é: " + count);
    }
}
