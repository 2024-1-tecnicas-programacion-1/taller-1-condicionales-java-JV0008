
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento {

    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        int[] num = {numero1, numero2, numero3, numero4};
        Arrays.sort(num);
        StringBuilder sb = new StringBuilder();
        for (int i : num) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();

        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}

