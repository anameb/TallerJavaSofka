package co.com.sofka.ejercicioseis;

public class NumerosParesImparesF {
    public static void main(String[] args){
        int numeros = 1;

        for (numeros=1; numeros <=100; numeros++) {

            if (numeros % 2 !=0) {
                System.out.println("numero impar : " + numeros);
            }
            else{
                System.out.println("numero par : " + numeros);

            }

        }
    }
}

