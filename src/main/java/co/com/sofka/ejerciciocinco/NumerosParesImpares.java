package co.com.sofka.ejerciciocinco;

public class NumerosParesImpares {
        public static void main(String[] args){
            int contador = 0;
            int numero = 1;
            while (contador != 50) {
                if (numero % 2 !=0) {
                    System.out.println("numeros impares : " + numero);
                }
                else{
                    System.out.println("numeros pares : " + numero);

                    contador++;
                    }
                    numero++;
                }
            }
        }
