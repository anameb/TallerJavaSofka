package co.com.sofka.ejerdieciseis;

import co.com.sofka.ejerciodieciocho.VideoJuego;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("ingrese si genero M o H:");
        String genero = datos.next();
        char generoChar = genero.charAt(0);

        System.out.println("Ingrese su nombre:");
        String nombre = datos.next();

        System.out.println("Ingrese su edad:");
        int edad = datos.nextInt();

        System.out.println("Ingrese su peso:");
        double peso = datos.nextDouble();

        System.out.println("Ingrese su altura:");
        double altura = datos.nextDouble();

        Persona persona1 = new Persona("Ana Estrada", 30 , 'M');
        Persona persona3 = new Persona("alejandro", 25, 'H', 50, 1.60);
        Persona persona2 = new Persona();
        persona2.setNombre("pepito");
        persona2.setEdad(50);
        persona2.setGenero('H');
        persona2.setPeso(60);
        persona2.setAltura(1.60);
        Persona persona4 = new Persona(nombre,edad,generoChar,peso,altura);
        System.out.println("persona1.toString() = " + persona1.toString());
        persona1.calcularIMC();
        persona1.esMayorDeEdad();
        System.out.println("persona1.toString() = " + persona2.toString());
        persona2.calcularIMC();
        persona2.esMayorDeEdad();
        System.out.println("persona1.toString() = " + persona3.toString());
        persona3.calcularIMC();
        persona3.esMayorDeEdad();
        System.out.println("persona1.toString() = " + persona4.toString());
        persona4.calcularIMC();
        persona4.esMayorDeEdad();
    }
}
