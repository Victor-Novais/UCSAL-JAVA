import java.util.Scanner;

public class Revisao_02 {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        System.out.print("Informe a hora atual (0-23): ");
        int horas = scan.nextInt();

        System.out.print("Informe os minutos atuais (0-59): ");
        int minutos = scan.nextInt();

        System.out.print("Informe os segundos atuais (0-59): ");
        int segundos = scan.nextInt();

        int segundos_totais= (horas*3600)+(minutos*60)+ segundos;

        System.out.println("Já se passaram " + segundos_totais + " segundos no dia.");
    }


}
