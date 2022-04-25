package co.com.sofka.ejercicionueve;

import java.util.Scanner;

public class Reemplazar {
    public static void main(String args[]) {
        String texto1 = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("La sonrisa sera la mejor arma contra la tristeza \n" + texto1.replace("a","e"));

        String texto2 = texto1.replace("a","e");

        Scanner element=new Scanner(System.in);
        System.out.println("ingrese una frase:");
        String frase=element.nextLine();


        System.out.println(texto2 + "\n" + frase);
    }
}
