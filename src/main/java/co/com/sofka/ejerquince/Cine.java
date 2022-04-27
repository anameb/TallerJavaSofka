package co.com.sofka.ejerquince;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        System.out.println("****** GESTION CINEMATOGRAFICA ********");
        System.out.println("--- 1-NUEVO ACTOR ---");
        System.out.println("--- 2-BUSCAR ACTOR ---");
        System.out.println("--- 3-ELIMINAR ACTOR ---");
        System.out.println("--- 4-MODIFICAR ACTOR ---");
        System.out.println("--- 5-VER TODOS LOS ACTORES ---");
        System.out.println("--- 6- VER PELICULAS DE LOS ACTORES ---");
        System.out.println("--- 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES ---");
        System.out.println("--- 8-SALIR ---");

        System.out.println("ingrese la opciones que desea: ");
        int opcion = 0;
        Scanner sc1 = new Scanner(System.in);
        opcion = sc1.nextInt();



        while (opcion != 8) {
            int menu = opcion;
            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                default:
                    System.out.println(" OPCION INCORRECTA");
            }

            System.out.println("--- 1-NUEVO ACTOR ---");
            System.out.println("--- 2-BUSCAR ACTOR ---");
            System.out.println("--- 3-ELIMINAR ACTOR ---");
            System.out.println("--- 4-MODIFICAR ACTOR ---");
            System.out.println("--- 5-VER TODOS LOS ACTORES ---");
            System.out.println("--- 6- VER PELICULAS DE LOS ACTORES ---");
            System.out.println("--- 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES ---");
            System.out.println("--- 8-SALIR ---");

            opcion = sc1.nextInt();

        }
    }
}
