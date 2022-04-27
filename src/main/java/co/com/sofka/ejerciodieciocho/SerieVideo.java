package co.com.sofka.ejerciodieciocho;

public class SerieVideo {
    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        crearSeries(series);
        entregarSeries(series);
        contarSeries(series);
        devoluciones(series);
        contarSeries(series);
        totalSeries(series);
        //---
        mayorCompareTo(series);
        mayorTemporada(series);


        VideoJuego[] videoJuegos = new VideoJuego[5];
        crearVideoJuego(videoJuegos);
        entregarVideoJuego(videoJuegos);
        contarVideoJuego(videoJuegos);
        devolucionesVideoJuego(videoJuegos);
        contarVideoJuego(videoJuegos);
        totalVideoJuego(videoJuegos);
        //---
        mayorCompareTo(videoJuegos);
        mayorHorasEtimadas(videoJuegos);
    }

    private static void totalSeries(Serie[] series) {
        System.out.println("------------------------------");
        System.out.println("Este es el total de Series existentes: ");
        for (Serie serie: series) {
            System.out.println(serie.toString());
        }

    }

    private static void devoluciones(Serie[] series) {
        series[4].devolver();
    }

    public static void entregarSeries(Serie[] series){
        //Entregar Series
        series[2].entregar();
        series[4].entregar();
    }

    private static void crearSeries(Serie[] series) {
        series[0] = new Serie("Palpito","Pinky");
        series[1] = new Serie("Breaking Bad",10, "Ficción", "Gilligan");
        //usando Set & Get
        series[2] = new Serie();
        series[2].setTitulo("Pasión de Gavilanes");
        series[2].setGenero("Telenovela");
        series[2].setCreador("Caracol");
        series[2].setTemporadas(54);
        //----------------------
        series[3] = new Serie("Hola Mundo","www");
        series[4] = new Serie("Bridgerton",20, "Romance", "Frederick");
    }


    private static void contarSeries(Serie[] series) {
        Integer totalEntregados = 0;
        for (Serie serie: series) {
            if (serie.isEntregado())
                totalEntregados +=1;
        }
        System.out.println("Existen "+ totalEntregados +" Series prestadas");
    }

    private static void mayorCompareTo(Serie[] series){
        int posMayor=0;
        //int mayor = 10000;
        for (int i=0;i<4;i++) {
            if (series[i].compareTo(series[i+1])>0) {
                //mayor = series[i].getTemporadas();
                posMayor = i;
            }else {
                posMayor = i+1;
            }
        }
        System.out.println("------------------------------");
        System.out.println("La serie con mas temporadas es: "+ series[posMayor].toString());
    }

    private static void mayorTemporada(Serie[] series){
        Integer mayor = -1;
        Integer i = 0;
        Integer pos=0;
        for (Serie serie: series) {
            if (serie.getTemporadas()>mayor) {
                mayor = serie.getTemporadas();
                pos = i;
            }
            i += 1;
        }
        System.out.println("La serie con mas temporadas es: "+ series[pos].toString());
        System.out.println("------------------------------");
    }



    private static void totalVideoJuego (VideoJuego[] videoJuegos) {
        System.out.println("------------------------------");
        System.out.println("Este es el total de Video juegos existentes: ");
        for (VideoJuego videoJuego: videoJuegos) {
            System.out.println(videoJuego.toString());

        }

    }

    private static void devolucionesVideoJuego(VideoJuego[] videoJuegos) {
        videoJuegos[3].devolver();
    }

    public static void entregarVideoJuego(VideoJuego[] videoJuegos){
        //Entregar VideoJuegos
        videoJuegos[4].entregar();
    }

    private static void crearVideoJuego(VideoJuego[] videoJuegos) {
        videoJuegos[0] = new VideoJuego("Fifa22",4);
        videoJuegos[1] = new VideoJuego("Super Mario  ",10, "Aventura", "Nintendo");
        //usando Set & Get
        videoJuegos[2] = new VideoJuego();
        videoJuegos[2].setTitulo("Minecraft");
        videoJuegos[2].setGenero("Construccion");
        videoJuegos[2].setCompania("Xbox");
        videoJuegos[2].setHorasEtimadas(2);
        //----------------------
        videoJuegos[3] = new VideoJuego("Fortnite",6);
        videoJuegos[4] = new VideoJuego("Warcraft",20, "Rol", " Blizzard Entertainment");
    }


    private static void contarVideoJuego(VideoJuego[] videoJuegos) {
        Integer totalEntregados = 0;
        for (VideoJuego videoJuego: videoJuegos) {
            if (videoJuego.isEntregado())
                totalEntregados +=1;
        }
        System.out.println("Existen "+ totalEntregados +" Video juegos prestados");
    }

    private static void mayorCompareTo(VideoJuego[] videoJuegos){
        int posMayor=0;
        //int mayor = 10000;
        for (int i=0;i<4;i++) {
            if (videoJuegos[i].compareTo(videoJuegos[i+1])>0) {
                //mayor = videoJuegos[i].getHorasEtimadas();
                posMayor = i;
            }else {
                posMayor = i+1;
            }
        }
        System.out.println("------------------------------");
        System.out.println("El video juego con mas horas estimadas es: "+ videoJuegos[posMayor].toString());
    }

    private static void mayorHorasEtimadas(VideoJuego[] videoJuegos){
        Integer mayor = -1;
        Integer i = 0;
        Integer pos=0;
        for (VideoJuego videoJuego: videoJuegos) {
            if (videoJuego.getHorasEtimadas()>mayor) {
                mayor = videoJuego.getHorasEtimadas();
                pos = i;
            }
            i += 1;
        }
        System.out.println("El video juego con mas horas estimadas es: "+ videoJuegos[pos].toString());
    }


}
