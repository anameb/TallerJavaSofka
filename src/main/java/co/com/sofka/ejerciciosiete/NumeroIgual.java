package co.com.sofka.ejerciciosiete;

import java.util.Scanner;

public class NumeroIgual {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero1;
        System.out.println("ingrese un número");
        numero1 = read.nextInt();

        while(numero1 < 0 && numero1 != 0){
            System.out.println("ingrese un número");
        }
        do {
            System.out.println("el numero es: " + numero1);
        } while (numero1 < 0 && numero1 != 0);

        }
}
