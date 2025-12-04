import java.util.Scanner;

public class Ejercicio6_Relacion6_Cadenas{
    public static void main(String[] args) {
        String cadena = "", cadFinal= "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una cadena");
        cadena = teclado.nextLine();
        

        for (int i = cadena.length() -1; i >= 0; i--) {
            cadFinal += cadena.charAt(i);
        }
        System.out.println(cadFinal);
    }
}