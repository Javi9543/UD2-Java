import java.util.Scanner;

public class Ejercicio3RelacionMetodos {

    public static String linea(char caracter, int repeticiones){

        String total = "";
        for (int i = 0; i < repeticiones; i++) {
            total += caracter;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura = 0;

        System.out.println("Introduzca la altura del triangulo para dibujarlo: ");
        altura = teclado.nextInt();

        System.out.println( "Dibujando triangulo...");

        for (int i = altura; i >= 1; i--) {
            System.out.println(linea('*', i));            
        }

        System.out.println("Fin del programa");
        
        teclado.close();
    }
}