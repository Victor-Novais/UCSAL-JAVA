import java.util.Scanner;

public class Revisao_03 {
    public static void  main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite a primeira nota.");
        int nota1= scan.nextInt();
        System.out.println("Digite o peso da primeira nota.");
        int pesoNota1= scan.nextInt();

        System.out.println("Digite a Segunda nota.");
        int nota2= scan.nextInt();
        System.out.println("Digite o peso da segunda nota.");
        int pesoNota2= scan.nextInt();


        System.out.println("Digite a terceira nota.");
        int nota3= scan.nextInt();
        System.out.println("Digite o peso da terceira nota.");
        int pesoNota3= scan.nextInt();


        int mediaDoAluno=((nota1*pesoNota1)+(nota2*pesoNota2)+(nota3*pesoNota3))/(pesoNota1+pesoNota2+pesoNota3);

        System.out.println("a media do aluno foi "+mediaDoAluno);
    }
}
