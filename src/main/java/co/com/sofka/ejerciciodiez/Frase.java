package co.com.sofka.ejerciciodiez;

import java.util.Scanner;


public class Frase {
    public static void main(String[] args) {
        Scanner element=new Scanner(System.in);
        System.out.println("ingrese una frase:");
        String frase1 =element.nextLine();

        String result = frase1.replace(" ", "");
        System.out.println(result);
    }


}

