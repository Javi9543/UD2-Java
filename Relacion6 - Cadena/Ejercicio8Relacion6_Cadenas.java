import java.util.Scanner;

public class Ejercicio8Relacion6_Cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "", cadFinal = "";

        System.out.println("Introduzca una cadena");
        cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == cadena.toUpperCase().charAt(i)) {
                cadFinal += cadena.toLowerCase().charAt(i);            
            } else {
                cadFinal += cadena.toUpperCase().charAt(i);
            }
        }
        System.out.println(cadFinal);
        teclado.close();
    }
}