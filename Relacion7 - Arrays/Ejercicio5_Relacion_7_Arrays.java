import java.util.Scanner;

public class Ejercicio5_Relacion_7_Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        int tamano;
        int numeros = 0;
        double mediaPositiva = 0d;
        double mediaNegativa = 0d;
        int sumaP = 0;
        int sumaN = 0;
        int contadorP = 0;
        int contadorN = 0;

        /* Pedir numeros */
        System.out.println("Introduzca el tamaño del array: ");
        tamano = teclado.nextInt();

        int [] num = new int [tamano];

        /* Programa Principal */

        System.out.println("Introduzca numeros para almacenarlos en el array: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = teclado.nextInt();
            numeros += num [i];
        }

        /*Comprobar medias y calcular medias positivas y negativas */
        
        for (int i = 0; i < num.length; i++) {
            
            if (num [i] > 0) {
                contadorP++;
                sumaP += num[i];
            }

            if (num [i] < 0) {
                contadorN++;
                sumaN += num[i];
            }
        }

        mediaPositiva = sumaP / contadorP; /* media positiva */
        mediaNegativa = sumaN / contadorN; /* mmedia negativa */

        System.out.println("La media positiva es: " + mediaPositiva);
        System.out.println("La media negativa es: " + mediaNegativa);

        teclado.close();
    }
}
