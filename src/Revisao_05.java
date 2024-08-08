import java.util.Scanner;

public class Revisao_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Informe a sua idade: ");
        int idade = scan.nextInt();


        if (idade < 16) {
            System.out.println("Sem permissão para votar.");
        } else if ((idade >= 16 && idade <= 17) || idade > 65) {
            System.out.println("Voto facultativo.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
