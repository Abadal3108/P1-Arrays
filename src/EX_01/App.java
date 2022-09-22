package EX_01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int mayores = 0;
        int menores = 0;
        int iguales = 0;
        Scanner sc = new Scanner(System.in);
        Integer numeros[] = new Integer[9];
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("pon numero");
            numeros[i] = sc.nextInt();
            if (numeros[i]==0){
                System.out.println("igual que 0");
                iguales++;
            } else if (numeros[i]>0) {
                System.out.println("Mas grande que 0");
                mayores++;
            }else {
                menores++;
                System.out.println("menor que cero");
            }
        }
        System.out.println(mayores+" mayores que 0, " + menores+" menores que 0, "+iguales+" iguales que 0");
    }
}