import java.util.Scanner;

public class Atividade_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número.");
        int n = sc.nextInt();

        System.out.println("Quer ver a tabuada? (sim/nao)");
        String r = sc.next();
        if (n > 1) {
            if (r.equals ("sim")) {
                calcular(n);
            } else {
                System.out.println("fim do programa.");
            }
        } else {
            System.out.println("Digite um valor maior que 1.");
        }
        }
        public static void calcular ( int n){
            for (int i =1; i<11;i++){
                System.out.println(n +"x"+ i +"=" +(n*i));
            }

        }

    }
