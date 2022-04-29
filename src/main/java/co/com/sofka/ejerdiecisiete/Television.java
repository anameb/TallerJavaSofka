package co.com.sofka.ejerdiecisiete;

public class Television extends Electrodomestico{
    private Float resolucion = 20F;
    private Boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(Float precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Television(Float precioBase, String color, String consumoEnergetico, Integer peso, Float resolucion, Boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Float getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public Float precioFinal() {
        super.precioFinal();
        Float total=this.precioBase;
        if (resolucion > 40) {
            total = total * 1.3F;
        }

        if (sintonizadorTDT) {
            total += 50F;
        }

        return total;

    }
}
