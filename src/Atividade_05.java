import java.util.Scanner;
public class Atividade_05 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int n;
        System.out.print("Digite um número: ");
        n= sc.nextInt();
        int a=0,b=1;
        boolean encontrado=false;
        while (b < n){
            int temp = b;
            b= a + b;
            a= temp;
            if( b == n){
                encontrado=true;
                break;
            }
        }
        if (encontrado){
            System.out.println(n + " é um termo da sequência de Fibonacci.");
        }else{
            System.out.println(n + " não é um termo da sequência de Fibonacci.");
        }
        sc.close();
    }

}
