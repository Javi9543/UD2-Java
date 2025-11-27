/* Pide una cadena por teclado (valida que sea un carácter) y muestra cuantas veces aparece ese caracter
en la cadena */

import java.util.Scanner;

public class EJercicio3Relación6 {
 public static void main (String[] args){
        /* Definir Variables */
        String cadena, porcion;
        String caracter;

        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        /* Pedir cadena */
        System.out.println("Introduzca una cadena");
        cadena = entrada.nextLine();

        /* Pedir Caracter */
        System.out.println("Introduzca un caracter");
        caracter = entrada.nextLine();

        /* Validar caracter */    
            for (int i = 0; i < cadena.length(); i++) {
                porcion = cadena.substring(i, i+1);
                if (porcion.equals(caracter)){
                    contador++;
                }
            }
            System.out.println("El caracter " + caracter + ", aparace " + contador + " veces en la cadena " + cadena); 
            entrada.close();
    }
}    
