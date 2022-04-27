package co.com.sofka.ejerciodieciocho;

public class Serie implements Entregable, Comparable {
    private String titulo = "Titulo Default";
    private int temporadas = 3;
    private boolean entregado = false;
    private String genero = "Genero Default";
    private String creador = "Creador Default";


    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //@Override
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "título='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object other) {
        Serie otherSerie = (Serie) other;
        int temporadaOtra = otherSerie.getTemporadas();
        //System.out.println(temporadaOtra);
        if (temporadas == temporadaOtra) return 0;
        else if (temporadas < temporadaOtra) return -1;
        else return 1;
    }

}

