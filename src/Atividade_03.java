import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n;
        double s=0;

        n = scan.nextInt();
        for( int i=1 ; i<=n; i++) {
            s+= 1.0/i;
        }
        System.out.print(s);
    }
}
