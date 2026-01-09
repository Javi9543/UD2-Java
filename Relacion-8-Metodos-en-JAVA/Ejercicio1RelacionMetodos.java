import java.util.Scanner;

public class Ejercicio1RelacionMetodos {

    public static String convierteEnPalotes(int n) {
        String num = n + ""; //Esto convierte a cadena el numero introducido por teclado del usuario
        String total = "";

        for (int i = 0; i < num.length(); i++) {
            char num_ac = num.charAt(i); // Guarda cada numero pasado a string para convertirlo a palote

            for(char j = '0'; j < num_ac; j++){
                total += "|"; // Este for va recorriendo num_ac, convirtiendo a palotes cada numero que encuentra
            }

            if (i < num.length() - 1) {
                total+= "-"; // Este if, hace que si el numero siguiente es menor que todos los que se estan convirtiendo a palotes pasa a ser u "-"
            }
        }

        return total;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Introduzca un numero entero para convertirlo a palotes: ");
        n = teclado.nextInt();

        System.out.println("Su numero convertido a palotes es: " + convierteEnPalotes(n));
        teclado.close();
    }
}
