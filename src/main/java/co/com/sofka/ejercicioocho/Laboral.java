package co.com.sofka.ejercicioocho;

import java.util.Locale;
import java.util.Scanner;

public class Laboral {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.println("ingrese un dia de la semana: ");
        String dia = work.nextLine();
        String dia2 =" ";
        String diaSemana =" ";

        switch (dia.toUpperCase())
        {
            case "LUNES": diaSemana = "Lunes";
                dia2 = "Dia laboral";
                break;
            case "MARTES": diaSemana = "Martes";
                dia2 = "Dia laboral";
                break;
            case "MIERCOLES": diaSemana = "Miercoles";
                dia2 = "Dia laboral";
                break;
            case "JUEVES": diaSemana = "Jueves";
                dia2 = "Dia laboral";
                break;
            case "VIERNES": diaSemana = "Viernes";
                dia2 = "Dia laboral";
                break;

            case "SABADO": diaSemana = "Sabado";
                dia2 = "dia no laboral";
                break;
            case "DOMINGO": diaSemana = "Domingo";
                dia2 = "dia no laboral";
                break;
        }
        System.out.println(diaSemana + " es un: " + dia2);
    }
}

