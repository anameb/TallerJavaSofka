package co.com.sofka.ejerciciodos;

import java.util.Scanner;

public class NumeroConsola {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("ingrese un número");
        numero1 = reader.nextInt();

        System.out.println("ingrese un número");
        numero2 = reader.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1+ " es mayor que " +numero2);
        }
        else if (numero1 == numero2){

            System.out.println(numero1+ " es igual a " +numero2);
        }
        else
            System.out.println(numero1+ " es menor que " +numero2);

        }

    }

