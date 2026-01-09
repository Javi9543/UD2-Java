import java.util.Scanner;

public class Ejercicio5RelacionMetodos {
    
    public static int [] concatena(int[ ]a, int[] b){
        int [] tot = new int[a.length + b.length]; // sumo los tamaños de los dos arrays en este

        for (int i = 0; i < a.length; i++) {
            tot[i] = a[i]; //copio lo que hay en el array1 en el array tot
        }

        for (int j = 0; j < b.length; j++) {
            tot[a.length + j] = b[j]; //copio añadiendo al array tot lo que hay en array2
        }
        return tot;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamano1 = 0;
        int tamano2 = 0;

        System.out.println("Introduzca cuantos numeros quiere añadir al array A: ");
        tamano1 = teclado.nextInt();

        int[] a = new int[tamano1];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduzca numeros para el primer array: ");
            a[i] = teclado.nextInt();
        }

        System.out.println("Introduzca cuantos numeros quiere añadir al array B: ");
        tamano2 = teclado.nextInt();

        int [] b = new int[tamano2];

        for (int i = 0; i < b.length; i++) {
            System.out.println("Introduzca numeros al segundo array: ");
            b[i] = teclado.nextInt();
        }
        
        int[] total = concatena(a, b); // aqui guardo los numeros de los arrays para el tamaño

        System.out.println("Array Fusionado: ");
        
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i] + " "); //Imprimo los numeros como dice el ejercicio
        }
        teclado.close();
    }
}
