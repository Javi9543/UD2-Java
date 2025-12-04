import java.util.Scanner;

public class Ejercicio10Relacion6_Cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadFinal = "", cad ;

        System.out.println("Introduzca una cadena para saber si es palindroma");
        cad = teclado.nextLine();

        for (int i = cad.length() -1; i >= 0; i--) {
            cadFinal += cad.charAt(i);
        }

        if(cad.equals(cadFinal)){
            System.out.println("La cadena introducida es palindroma");
        }else{
            System.out.println("La cadena no es palindroma");
        }
    }
}
