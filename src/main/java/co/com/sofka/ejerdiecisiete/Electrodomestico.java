package co.com.sofka.ejerdiecisiete;

public class Electrodomestico {


    Float precioBase = 100F;
    String color = String.valueOf(Colores.BLANCO);
    String consumoEnergetico = String.valueOf(ConsumoEnergetico.F);
    Integer peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(Float precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Float precioBase, String color, String consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    private String comprobarConsumoEnergetico(String letra) {
        if (letra.equals(String.valueOf(ConsumoEnergetico.A)) ||
                letra.equals(String.valueOf(ConsumoEnergetico.B)) ||
                letra.equals(String.valueOf(ConsumoEnergetico.C)) ||
                letra.equals(String.valueOf(ConsumoEnergetico.D)) ||
                letra.equals(String.valueOf(ConsumoEnergetico.E)) ||
                letra.equals(String.valueOf(ConsumoEnergetico.F))) {
            return letra;
        } else {
            return String.valueOf(ConsumoEnergetico.F);
        }
    }

    private String comprobarColor(String color) {
        if (color.equals(String.valueOf(Colores.AZUL)) ||
                color.equals(String.valueOf(Colores.BLANCO)) ||
                color.equals(String.valueOf(Colores.GRIS)) ||
                color.equals(String.valueOf(Colores.NEGRO)) ||
                color.equals(String.valueOf(Colores.ROJO))) {
            return color;
        } else {
            return String.valueOf(Colores.BLANCO);
        }
    }

    private Float precioPeso() {
        if (peso >= 0 && peso <= 19)
            return 10F;
        else if (peso >= 20 && peso <= 49) {
            return 50F;
        } else if (peso > 50 && peso <= 79) {
            return 80F;
        } else
            return 100F;
    }

    private Float precioConsumo() {
        switch (consumoEnergetico) {
            case "A":
                return 100F;
            case "B":
                return 80F;
            case "C":
                return 60F;
            case "D":
                return 50F;
            case "E":
                return 30F;
            case "F":
                return 10F;
            default:
                return 0F;
        }
    }

    public Float precioFinal() {

        precioBase += precioConsumo()+precioPeso();
        return precioBase;
    }
}
