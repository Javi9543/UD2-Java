import java.util.Scanner;

public class Ejercicio2_Intro_Metodos{
    static int calculoCubo (int numero){
        return numero * numero * numero;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0;

        System.out.println("Introduzca un numero para calcular su cubo: ");
        num = teclado.nextInt();

        System.out.println("El total del cubo del numero " + num + " es " + calculoCubo(num) );

        teclado.close();
    }
        
}
