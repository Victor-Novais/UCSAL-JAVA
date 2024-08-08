import java.util.Scanner;

public class Revisao_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Informe a hora de início (0-23): ");
        int horaInicio = scan.nextInt();
        System.out.print("Informe os minutos de início (0-59): ");
        int minutoInicio = scan.nextInt();
        System.out.print("Informe os segundos de início (0-59): ");
        int segundoInicio = scan.nextInt();


        System.out.print("Informe a hora de término (0-23): ");
        int horaFim = scan.nextInt();
        System.out.print("Informe os minutos de término (0-59): ");
        int minutoFim = scan.nextInt();
        System.out.print("Informe os segundos de término (0-59): ");
        int segundoFim = scan.nextInt();


        int inicioEmSegundos = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio;
        int fimEmSegundos = (horaFim * 3600) + (minutoFim * 60) + segundoFim;


        int duracaoEmSegundos = fimEmSegundos - inicioEmSegundos;


        int duracaoHoras = duracaoEmSegundos / 3600;
        int duracaoMinutos = (duracaoEmSegundos % 3600) / 60;
        int duracaoSegundos = duracaoEmSegundos % 60;

        System.out.println("A atividade durou " + duracaoHoras + " horas, " + duracaoMinutos + " minutos e " + duracaoSegundos + " segundos.");
    }
}