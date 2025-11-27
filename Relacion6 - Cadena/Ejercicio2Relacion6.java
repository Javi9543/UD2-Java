/* Realizar un programa que comprueba si una cadena leida por teclado comienza por una subcadena 
introducida por teclado */

import java.util.Scanner;
public class Ejercicio2Relacion6 {
    public static void main (String [] args){

        /*Definición de variables: */
        Scanner entrada = new Scanner (System.in);
        String cadena = "";
        String subcadena = "";

        /* Pido la cadena principal */
        System.out.println("Introduzca una cadena");
        cadena = entrada.nextLine();

        /* Pedir Subcadena */
        System.out.println("Introduzca la subcadena");
        subcadena = entrada.nextLine();

        /* Comporbar si empieza por subcadena */

        if (cadena.startsWith(subcadena)){
            System.out.println("La cadena " + cadena + "empieza por " + subcadena);
        } else { 
            System.out.println("La subcadena " + subcadena + "no pertenece a la cadena " + cadena);
            System.out.println();
        }
        entrada.close();
    }
    
}
