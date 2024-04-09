import java.util.Scanner;
public class Atividade_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double s = 0;

        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {

            if (n >= 1) { // Corrigido para verificar 'n' em vez de 'c'

                s += (double) i / n; // Convertendo 'i' ou 'c' para double para garantir divisão decimal
            }
        }
        System.out.print(s);
    }
}
