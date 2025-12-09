import java.util.Scanner;

public class Ejercicio6_Relacion_7_Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamano;
        int numeros = 0; 
        double media = 0d;
        double mediaClase = 0d;
        double mediaTotal = 0d;
        int contadorM = 0;

        /* Pedir tamaño Array */
        System.out.println("Introduzca el tamaño del array: ");
        tamano = teclado.nextInt();

        int [] notas = new int [tamano];

        /* Pedir Notas */
         System.out.println("Introduzca notas para almacenarlos en el array: ");

        for (int i = 0; i < notas.length; i++) {
            notas[i] = teclado.nextInt();
            numeros += notas [i];
        }

        System.out.println("Notas introducidas correctamente, calculando medias...");
        for (int i = 0; i < notas.length; i++) {
            if (notas [i] > 0) {
                contadorM++;
                media += notas[i];
            }
        }
         
        mediaTotal = numeros / tamano;  /* Media Global */
        mediaClase = media / contadorM; /* Notas sobre la media */

        System.out.println("La nota media TOTAL de clase es: " + mediaTotal);
        System.out.println("La nota media de clase es: " + mediaClase);
        System.out.println("Las notas sobre la media son: ");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mediaClase){
                System.out.print(notas[i]);
            }
        }


        teclado.close();
    }
}
