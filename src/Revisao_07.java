import java.util.Scanner;

public class Revisao_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Informe o valor do primeiro lado: ");
        int lado1 = scan.nextInt();
        System.out.print("Informe o valor do segundo lado: ");
        int lado2 = scan.nextInt();
        System.out.print("Informe o valor do terceiro lado: ");
        int lado3 = scan.nextInt();


        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {

            System.out.println("Os valores fornecidos não formam um triângulo.");
        }
    }
}
