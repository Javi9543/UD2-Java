import java.util.Scanner;

public class Ejercicio3_Intro_Metodos {

    static int multiplicarNumeros (int n1, int n2){
        int total = n1 * n2;
        return total;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Introduzca el primer numero");
        num1 = teclado.nextInt();

        System.out.println("Introduzca el segundo numero");
        num2 = teclado.nextInt();

        System.out.println("El total de multiplicar " + num1 + " * " + num2 + " es " + multiplicarNumeros(num1, num2));

        teclado.close();
    }
}
