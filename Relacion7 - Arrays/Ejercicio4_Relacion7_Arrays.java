import java.util.Scanner;

public class Ejercicio4_Relacion7_Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int tamano = 0 ;
        int tamano2 = 0;
        int tamanoMax = 0, n1 = 0, n2 = 0;

        System.out.println("Introduzca el tamaño del primer array: ");
        tamano = teclado.nextInt();

        int [] num1 = new int [tamano];

        System.out.println("Introduzca numeros para almacenarlos en el primer array: ");

        for (int i = 0; i < num1.length; i++) {
            num1[i] = teclado.nextInt();
        }

        /*----------------------------------------------------------------------------------*/

        System.out.println("Introduzca el tamaño del segundo array: ");
        tamano2 = teclado.nextInt();

        int [] num2 = new int [tamano2];

        System.out.println("Introduzca numeros para almacenarlos en el segundo array: ");

        for (int i = 0; i < num2.length; i++) {
            num2[i] = teclado.nextInt();
        }

        /*-----------------------------------------------------------------------------------*/

        tamanoMax = Math.max(tamano, tamano2);
        int [] tot = new int [tamanoMax];

        for (int i = 0; i < tot.length; i++) {

            n1 = ( i < tamano ) ? num1[i]: 0;
            n2 = ( i < tamano2 ) ? num2 [i]: 0;

            tot [i] = Math.max(n1, n2);
        }
        System.out.print("El resultado es: ");
        
        for (int i = 0; i < tot.length; i++) {
            System.out.print(tot[i] + " ");
        }
        
        
        teclado.close();
    }
}
