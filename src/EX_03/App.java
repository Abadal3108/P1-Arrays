package EX_03;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        int suma_total=0;
        Integer numeros[][] = new Integer[4][5];
        for (int i = 0; i < 4; i++) {
            int suma_fila = 0;

            for (int j = 0; j < 5; j++) {
                int random = rand.nextInt(10);
                numeros[i][j] = random;
                System.out.print("[" + numeros[i][j] + "]");
                suma_fila = suma_fila + numeros[i][j];

            }
            suma_total = suma_total+suma_fila;
            System.out.print("["+suma_fila+"]");
            System.out.println(" ");
        }
        for (int i = 0; i < 4; i++) {
            int suma_columna = 0;
            suma_columna=numeros[0][i]+numeros[1][i]+numeros[2][i]+numeros[3][i];
            System.out.print("["+suma_columna+"]");
            suma_total=suma_total+suma_columna;
        }
        System.out.println("["+suma_total+"]");
    }
}
