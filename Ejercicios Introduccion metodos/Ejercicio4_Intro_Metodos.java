import java.util.Scanner;

public class Ejercicio4_Intro_Metodos {

    static int tablaMultiplicar (int n1){

        for (int i = 0; i <= 10; i++) {
            int resultado = n1 * i;

            System.out.println(n1 + " x " + i + " = " + resultado );
        }
        System.out.print("Esta fue la tabla del ");
        return n1;
        
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;

        System.out.println("Introduzca un numero para ver su tabla de multiplicar");
        num1 = teclado.nextInt();


        System.out.println(tablaMultiplicar(num1));

        teclado.close();
    }
}
