package ejercicios;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Edad{
    public static String evaluar(int dia, int mes, int anno) {
        if (dia < 1 || mes < 1 || dia > 31 || mes > 12 ){
            return "Ingrese datos coherentes";
        }else {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(anno, mes, dia);
        if (dia <= 31 && dia >= 1 && mes <= 12 && mes >= 1) {
            Period periodo = Period.between(nacimiento, hoy);
            int annos = periodo.getYears();
            if ((dia <= hoy.getDayOfMonth() && mes <= hoy.getMonthValue()) && annos > 0) {
                return "Usted tiene " + annos + " años";
            } else if (annos > 0) {
                return "Usted tiene " + (annos) + " años";
            }
        }
        return "Ingrese datos coherentes";
    }
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento\nDía:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();

        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);

        lector.close();
    }
}