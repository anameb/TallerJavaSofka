package co.com.sofka.ejerciodieciocho;

public class VideoJuego implements Entregable, Comparable{
        private String titulo = "Titulo Default";
        private int horasEtimadas = 10;
        private boolean entregado = false;
        private String genero =  "Genero Default";
        private String compania = "Compañia Default";


        public VideoJuego() {
        }

        public VideoJuego(String titulo, int horasEtimadas) {
            this.titulo = titulo;
            this.horasEtimadas = horasEtimadas;
        }

        public VideoJuego(String titulo, int horasEtimadas, String genero, String compania) {
            this.titulo = titulo;
            this.horasEtimadas = horasEtimadas;
            this.genero = genero;
            this.compania = compania;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getHorasEtimadas() {
            return horasEtimadas;
        }

        public void setHorasEtimadas(int horasEtimadas) {
            this.horasEtimadas = horasEtimadas;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getCompania() {
            return compania;
        }

        public void setCompania(String compania) {
            this.compania = compania;
        }

        @Override
        public String toString() {
            return "Videojuego{" +
                    "titulo='" + titulo + '\'' +
                    ", horasEtimadas=" + horasEtimadas +
                    ", entregado=" + entregado +
                    ", genero='" + genero + '\'' +
                    ", compania='" + compania + '\'' +
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
        VideoJuego otherVideoJuego = (VideoJuego) other;
        int horasEstimadasOtra = otherVideoJuego.getHorasEtimadas();
        //System.out.println(horasEstimadasOtra);
        if (horasEtimadas == horasEstimadasOtra) return 0;
        else if (horasEtimadas < horasEstimadasOtra) return -1;
        else return 1;

    }
}


