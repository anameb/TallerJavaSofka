package co.com.sofka.ejerdiecisiete;

public class Lavadora extends Electrodomestico {

    private static Integer CARGADEFECTO = 5;

    private Integer carga = CARGADEFECTO;

    public Lavadora() {
        super();
    }

    public Lavadora(Float precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Lavadora(Float precioBase, String color, String consumoEnergetico, Integer peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public Float precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            return this.precioBase + 50;
        } else {
            return this.precioBase;
        }

    }
}
