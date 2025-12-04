import java.util.Scanner;

public class Ejercicio7Relacion6_cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena, cadFinal, cadAux;
        char car1 = ' ', car2 = ' ';

        System.out.println("Introduzca una cadena");
        cadena = teclado.nextLine();

        System.out.println("Introduzca un caracter");
        cadAux = teclado.nextLine();

        if (cadAux.length() == 1) { //guardar lo que hay en cadAux en car1 lo cual hago lo mismo para el car2
            car1 = cadAux.charAt(0);
        }
        cadAux = "";

        System.out.println("Introduzca el caracter a reemplazar");
        cadAux = teclado.nextLine();

        if (cadAux.length() == 1) {
            car2 = cadAux.charAt(0);
        }

        cadFinal =  cadena.replace(car1, car2);
        System.out.println(cadFinal);
    }
}
