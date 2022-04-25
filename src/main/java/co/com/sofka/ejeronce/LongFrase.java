package co.com.sofka.ejeronce;

import java.util.Scanner;

public class LongFrase {
    public static void main(String[] args) {
        Scanner capture =new Scanner(System.in);
        System.out.println("ingrese una frase:");
        String frase =capture.nextLine();
        int len = frase.length();
        System.out.println("Longitud de la frase es :" + len);

        int contador = 0;
        String vocales =" ";

        for (int x= 0; x < frase.length() ; x++) {

            if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o')|| (frase.charAt(x)=='u')) {
                contador++;
                vocales+= frase.charAt(x);
                }

            }
        System.out.println("La frase " + frase + " contiene " + contador + " vocales: " + vocales);
        }

    }