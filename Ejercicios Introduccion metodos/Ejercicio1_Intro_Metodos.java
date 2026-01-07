import java.util.Scanner;

public class Ejercicio1_Intro_Metodos {
    static String saludo ( String Nombre){

        System.out.println("Hola, " + Nombre );
        return Nombre;
        
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = " ";

        System.out.println("Introduzca su nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Su nombre es: " + saludo(nombre) );

        teclado.close();
    }
}
