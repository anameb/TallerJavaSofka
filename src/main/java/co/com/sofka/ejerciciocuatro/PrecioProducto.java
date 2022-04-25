package co.com.sofka.ejerciciocuatro;

import java.util.Scanner;

public class PrecioProducto {
        public static void main(String[] args) {
            double precio;
            double iva = 1.21;

            Scanner apli = new Scanner(System.in);
            System.out.println("ingrese precio del producto: ");
            precio = apli.nextInt();

            double precioFinal=(precio * iva);
            System.out.println("el precio final del producto es : " + precioFinal);

        }
}
