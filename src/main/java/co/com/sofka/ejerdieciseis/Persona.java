package co.com.sofka.ejerdieciseis;

import java.util.Random;

public class Persona {
    final int PESOIDEAL = 1;
    final int PESONOIDEAL = 0;
    final int SOBREPESO = 1;

    final static char M = 'M';
    final static char H = 'H';
    private String nombre = "";
    private int edad = 0;
    private String dni = this.obtenerDni();
    private char genero = H;
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = comprobarSexo(genero);
    }

    public Persona(String nombre, int edad, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, String dni, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = comprobarSexo(genero);
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularIMC() {
        double indiceMasaCorporal = peso / Math.pow(altura, 2);

        if (indiceMasaCorporal < 20) {
            System.out.println("su indice de masa corporal es: "+PESOIDEAL+" --> Peso Ideal");
        } else if (indiceMasaCorporal >= 20 && indiceMasaCorporal <= 25) {
            System.out.println("su indice de masa corporal es: "+PESONOIDEAL+" --> Peso No Ideal");
        } else {
            System.out.println("su indice de masa corporal es: "+SOBREPESO+" --> Sobrepeso");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = comprobarSexo(genero);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("NO es mayor de edad ");
        }
    }

    private String obtenerDni(){
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X'
                , 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        String numeroDNI = "";
        int numero1DNI = 0;

        Random num = new Random();
        numero1DNI = num.nextInt(99999999);
        numeroDNI = String.valueOf(numero1DNI)+letrasDNI[numero1DNI%23];

        return numeroDNI;
    }

    private char comprobarSexo(char genero){
        if (genero == H || genero == M){
            return genero;
        }else{
            return H;
        }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

