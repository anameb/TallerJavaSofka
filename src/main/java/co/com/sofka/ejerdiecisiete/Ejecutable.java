package co.com.sofka.ejerdiecisiete;

public class Ejecutable {

    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora(500F, "AZUL", "F", 60, 35);
        electrodomesticos[1] = new Lavadora();
        electrodomesticos[2] = new Lavadora();
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora();
        electrodomesticos[5] = new Television(800F, "NEGRO", "A", 35, 50F, true);
        electrodomesticos[6] = new Television();
        electrodomesticos[7] = new Television();
        electrodomesticos[8] = new Television();
        electrodomesticos[9] = new Television();

        Float totalElectrodomesticos = 0F;
        for (int i=0; i< electrodomesticos.length; i++) {
            if (electrodomesticos[i] instanceof Lavadora) {
                Lavadora lavadora = (Lavadora)electrodomesticos[i];
                Float totalLavadora = lavadora.precioFinal();
                System.out.println("Lavadora, "+totalLavadora);
                totalElectrodomesticos += totalLavadora;
            } else if (electrodomesticos[i] instanceof Television) {
                Television television = (Television) electrodomesticos[i];
                Float totalTelevision = television.precioFinal();
                System.out.println("Television "+totalTelevision);
                totalElectrodomesticos += totalTelevision;
            }
            //System.out.println((Lavadora));
        }
        System.out.println("totalElectrodomesticos = " + totalElectrodomesticos);
    }
}
