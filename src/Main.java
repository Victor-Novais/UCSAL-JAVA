//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double s = 0;

        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {

            if(n%i==0) {
                s+=1- 1.0/i;
            }else {
                s+=1+ 1.0/i;
            }


            System.out.print(s);
        }
}}