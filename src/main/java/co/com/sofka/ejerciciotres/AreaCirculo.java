package co.com.sofka.ejerciciotres;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner apli = new Scanner(System.in);
        double radio;
        System.out.println("ingrese el radio del circulo: ");
        radio = apli.nextInt();

        double area= Math.PI * Math.pow(radio,2);
        System.out.println("el area del circulo es: "+area);

    }
}
