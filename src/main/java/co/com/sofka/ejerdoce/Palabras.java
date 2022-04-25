package co.com.sofka.ejerdoce;

import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        Scanner element = new Scanner(System.in);
        System.out.println("ingrese una palabra:");
        String palabra1 = element.nextLine();

        Scanner ing = new Scanner(System.in);
        System.out.println("ingrese otra palabra:");
        String palabra2 = ing.nextLine();
        String diferente = "";
        String palabraSelec = "";

        int longitudp1 = palabra1.length();
        int longitudp2 = palabra2.length();
        int lengthFor = 0;

        if (palabra2.equalsIgnoreCase(palabra1)) {
            System.out.println("Las palabras ingresadas:" + palabra1 + " y " + palabra2 + " son iguales");
        } else {
            if (longitudp1 > longitudp2) {
                lengthFor = longitudp2;
                palabraSelec = palabra1;
            } else if (longitudp1 == longitudp2) {
                lengthFor = longitudp1;
                palabraSelec = palabra2;
            } else {
                lengthFor = longitudp1;
                palabraSelec = palabra2;
            }
            for (int x = 0; x <= lengthFor-1; x++) {
                System.out.println(palabra1.charAt(x)+"-"+palabra2.charAt(x));
                if ((palabra1.charAt(x) != palabra2.charAt(x))) {
                    System.out.println(palabraSelec);
                    diferente = palabraSelec.substring(x);
                    break;
                }
            }
            System.out.println("las palabras " + palabra1 + " y " + palabra2 + " son diferentes en: " + diferente);
        }
    }

}
