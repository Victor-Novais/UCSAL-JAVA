import java.util.Scanner;

public class Atividade_09 {
    public static void main(String[] args) {
        System.out.println("Digite qualquer numero.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean ehPrimo= true;

        for (int i = 1; n>= i ; i++) {

            if (n % i == 0) {
                count++;

                if(count > 2){
                    ehPrimo=false;
                    break;
                }

            }


        }
        if (ehPrimo){
            System.out.println("É primo");
        }else {
            System.out.println("Não é primo");
        }
    }
}