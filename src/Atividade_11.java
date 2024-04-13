public class Atividade_11 {
    public static void main(String[] args) {
        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
                }
            }
        }
    }
}
