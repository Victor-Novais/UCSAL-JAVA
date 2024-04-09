import java.util.Scanner;
public class Atividade_02 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n;
        double s=0;



        n = scan.nextInt();
        for( int i=1 ; i<=n; i++) {
            int c=n;
            if (c >= 1) {

                c--;
                s += i / c;
            }
        }
        System.out.print(s);
    }
}
