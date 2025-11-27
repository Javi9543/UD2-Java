/* Escribir por pantalla un caracter de una cadena introducida por teclado */

import java.util.Scanner;
public class Ejercicio1Relacion6 {
    public static void main(String[] args) {
       /*Definir variables */
       String cadena = "";
       char caracter;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Introduzca una cadena para imprimir los caracteres: ");
       cadena = entrada.nextLine();
       System.out.println("---------------------------------------------------"); //Uso estas lineas para separar la cadena introducida de los caracteres

       
       
       for (int i = 0; i < cadena.length(); i++) { //recorre la cadena
        caracter = cadena.charAt(i);//lee caracter a caracter
        System.out.println("La cadena caracter por caracter es: "+ caracter + "");
       }
        entrada.close();
        
    }
}