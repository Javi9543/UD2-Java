import java.util.Scanner;

public class Ejercicio3_Relacion7_Array {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamano;
        char caracter = ' ';

        System.out.println("Introduzca el tamaño del array: ");
        tamano = teclado.nextInt();
        tamano = tamano + 1;

        String [] cadenas = new String [tamano];

        System.out.println("Introduzca cadenas para almacenarlas en su array");

        for (int i = 0; i < cadenas.length; i++) {  
            cadenas [i] = teclado.nextLine();
        }

        System.out.println("Introduzca un caracter para mostrar las cadenas en el array");
        caracter = teclado.nextLine().charAt(0); //pasar de cadena a caracter

        
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].indexOf(caracter) == 0) {
                System.out.println(cadenas[i]);
            }
        }

        teclado.close();
    }
}
