import java.util.Scanner;
public class Atividade_04 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n, cont=0;
        n=sc.nextInt();
        for( int i = 1; i <= n; i++) {
            if(n%i==0) {
                cont++;
            }
        }
        if(cont==2) {
            System.out.println("e primo");
        }else {
            System.out.println("não é primo");
        }
}}
