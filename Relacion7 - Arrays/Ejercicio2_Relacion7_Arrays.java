import java.util.Scanner;

public class Ejercicio2_Relacion7_Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = 0;
        String cadena = "";

        System.out.println("Introduzca el tamaño del array");
        tamaño = teclado.nextInt();
        
        tamaño = tamaño + 1;
        
        String [] cadenas = new String [tamaño];
        
        System.out.println("Introduzca cadenas para almacenarlas en su array");

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = teclado.nextLine(); 
        }

        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > cadena.length()) {
                cadena = cadenas[i];
            }
        } 

        System.out.printf("La cadena más larga es %s \n" , cadena);
        
        teclado.close();
    }
}