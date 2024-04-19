import java.util.Scanner;

public class Atividade_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor.");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo valor.");
        int n2 = sc.nextInt();

        menu(n1, n2);


    }

    public static void menu(int n1, int n2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha sua opção:\n" +
                "1 – Soma\n" +
                "2 – Subtração\n" +
                "3 – Multiplicação\n" +
                "4 – Divisão\n" +
                "5 – Trocar valores\n" +
                "6 – Sair");

        int rMenu = sc.nextInt();

        if (rMenu == 1) {
            soma(n1, n2);
        }
        if (rMenu == 2) {
            subtracao(n1, n2);
        }
        if (rMenu == 3) {
            multiplicacao(n1, n2);
        }
        if (rMenu == 4) {
            divisao(n1, n2);
        }
        if (rMenu == 5) {
            main(new String[0]);
        }
        if (rMenu==6){
            System.out.println("Fechou o aplicativo");

        }
    }

    public static void soma(int n1, int n2) {
        int count = 0;
        count = n1 + n2;
        System.out.println("valor da soma foi: " + count);
        menu(n1, n2);
    }

    public static void subtracao(int n1, int n2) {
        int count = 0;
        count = n1 - n2;
        System.out.println("valor da subtração foi: " + count);
        menu(n1, n2);
    }

    public static void multiplicacao(int n1, int n2) {
        int count = 0;
        count = n1 * n2;
        System.out.println("valor da multiplicação foi: " + count);
        menu(n1, n2);
    }

    public static void divisao(int n1, int n2) {
        int count = 0;
        count = n1 / n2;
        System.out.println("valor da divisão foi: " + count);
        menu(n1, n2);
    }

}
