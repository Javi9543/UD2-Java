import java.util.Scanner;

public class Ejercicio5_intro_Metodos {

    public static void numeroPar (int n1){
        System.out.println("Verificar si tu numero es par: ");

        if (n1 % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }   
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numPar = 0;

        System.out.println("Introduzca un numero para saber si es par: ");
        numPar = teclado.nextInt();

        numeroPar(numPar);
        
        teclado.close();
    }
}
