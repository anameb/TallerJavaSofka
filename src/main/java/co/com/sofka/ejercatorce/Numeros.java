package co.com.sofka.ejercatorce;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);
        System.out.println("ingrese un número");
        numero = reader.nextInt();
        System.out.println("numeros de " + numero + " hasta 1000");
        boolean par = false;

        if (numero % 2 == 0) {
            par = true;
        } else {
            par = false;
        }

        for (int i = numero; i <= 1000; i++) {
            if (par) {
                if (i % 2 == 0)
                    System.out.println(i);
            } else {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        }
    }
}

