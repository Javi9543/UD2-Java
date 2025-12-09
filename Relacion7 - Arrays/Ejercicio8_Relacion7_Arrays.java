import java.util.Scanner;

public class Ejercicio8_Relacion7_Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numValorOriginal;
        int numValorCambiado;

        int [] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int) (Math.random()*21);
        }

        System.out.println("Numeros: ");
        for (int i : numeros) {
            System.out.printf(" %d ", i);
        }

        System.out.println(" ");
        System.out.print("Introduzca el primer valor (del array)");
        numValorOriginal = teclado.nextInt();

        System.out.print("Introduzca el segundo valor a cambiar (entre 0 y 20): ");
        numValorCambiado = teclado.nextInt();

        for (int i = 0; i < numeros.length; i++) { /* Cambia el valor indicado original, por el valor a reemplazar */
            if (numValorOriginal == numeros[i]) {
                numeros [i] = numValorCambiado;
            }
        }

        System.out.println("La lista nueva modificada es: ");
        for (int i : numeros) {
            System.out.printf(" %d ", i);
        }
         System.out.println(" ");
        
     teclado.close();
    }
}
