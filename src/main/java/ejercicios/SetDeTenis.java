package ejercicios;

import java.util.Scanner;

public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) { 
        if (numVictoriasA < 0 || numVictoriasB < 0 || numVictoriasB > 7 || numVictoriasA > 7 || numVictoriasB == numVictoriasA && numVictoriasA == 7 || (numVictoriasA == 7 && numVictoriasB <= 4) || (numVictoriasB == 7 && numVictoriasA <= 4)) {
            return "Inválido";
        } else if (numVictoriasA == 7 && numVictoriasB == 6) {
            return "Ganó A";
        } else if (numVictoriasB == 7 && numVictoriasA == 6) {
            return "Ganó B";
        } else if (numVictoriasB <= 7 && numVictoriasA <= 7 && numVictoriasA - numVictoriasB >= 2 && numVictoriasA >= 6) {
            return "Ganó A";
        } else if (numVictoriasB <= 7 && numVictoriasA <= 7 && numVictoriasB - numVictoriasA >= 2 && numVictoriasB >= 6) {
            return "Ganó B";
        } else if (Math.abs(numVictoriasA - numVictoriasB) <= 1 && numVictoriasB <= 7 && numVictoriasA <=7 && numVictoriasB != 7 && numVictoriasA != 7 || (numVictoriasA < 6 && numVictoriasB <= 2) || (numVictoriasB < 6 && numVictoriasA <=2)) {
            return "Aún no termina";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}

