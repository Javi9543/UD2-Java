import java.util.Scanner;

public class Ejercicio9Relacion6_Cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena, subcadena;

        System.out.println("Introduzca la cadena");
        cadena = teclado.nextLine();

        System.out.println("Introduzca la subcadena a buscar");
        subcadena = teclado.nextLine();

        for (int i = 0; i <= cadena.length() - subcadena.length(); i++) {
            if (cadena.substring(i, i + subcadena.length()).equals(subcadena)) {
                System.out.println("La cadena contiene subcadena");
                break;
            }
        }
        
        teclado.close();
    }
}


