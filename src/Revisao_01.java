import java.util.Scanner;

public class Revisao_01 {
    public static void main (String args[]){
        System.out.println("Digite uma temperatura em centígrados.");
        int c,f;

        Scanner scan = new Scanner(System.in);
        c= scan.nextInt();

        f=((c*9)+160)/5;
        System.out.println("o resultado da conversão para Fahrenheit é "+f+"F");

    }

}
