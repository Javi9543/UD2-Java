package Ejercicio6Metodos;

import java.util.Scanner;

public class Ejercicio6RelacionMetodos_uso_biblioteca {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] miArray = Ejercicio6RelacionMetodos.generaArrayInt(8, 5, 30);
        int [] miArrayInvertido = Ejercicio6RelacionMetodos.invertirArray(miArray);
        int numeromin = Ejercicio6RelacionMetodos.minimoArrayInt(miArray);
        int numeromax = Ejercicio6RelacionMetodos.maximoArrayInt(miArray);
        double mediaArray = Ejercicio6RelacionMetodos.mediaArrayInt(miArray);
        int numeroBuscar = 0;
        int n = 0;
        int n2 = 0;
              
    
        System.out.println("Creando Array...");
        System.out.print("Array generado: ");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i] + " ");
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("El numero menor es: " + numeromin); 
        System.out.println("El numero mayor del array es: " + numeromax);
        System.out.println("La media de los numeros del array es: "+ mediaArray);

        System.out.println("Introduzca un numero para buscarlo en el array: ");
        numeroBuscar = entrada.nextInt();

        boolean estaEnArray = Ejercicio6RelacionMetodos.estaEnArrayInt(miArray, numeroBuscar );
        int posicion = Ejercicio6RelacionMetodos.posicionEnArray(miArray, numeroBuscar);

        if (estaEnArray) {
            System.out.printf("El numero %d, esta en el Array, en la posición %d", numeroBuscar, posicion);
            System.out.println( " ");
        } else {
            System.out.printf("El numero %d, no esta en el Array", numeroBuscar);
            System.out.println( " ");
        }

        System.out.println("------------------------------------------------");

        System.out.println("Volteando tu array... ");
        System.out.println("Array invertido: ");

        for (int i : miArrayInvertido) {
            System.out.print( i + " ");
        }
        System.out.println( "");

        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Introduzca el numero de posiciones que quiere rotar a la derecha de su array");
        n = entrada.nextInt();

        int[] RotarMiArray = Ejercicio6RelacionMetodos.rotarDerechaArrayInt(miArray, n);

        System.out.println("Rotando tu array... ");

        for (int i : RotarMiArray) {
            System.out.print(i  + " ");
        }
        System.out.println( "");
        System.out.println("-----------------------------------------------");

        System.out.println("Introduzca el numero de posiciones que quiere rotar a la izquierda de su array");
        n2 = entrada.nextInt();

        int[] RotarMiArray2 = Ejercicio6RelacionMetodos.rotarIzquierdaArrayInt(miArray, n2);

        System.out.println("Rotando tu array... ");

        for (int i : RotarMiArray2) {
            System.out.print(i  + " ");
        }
        System.out.println( "");

        entrada.close();
    }
}
