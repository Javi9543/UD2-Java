import java.util.Scanner;
public class Ejercicio1Relacion6_Cadenas {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduzca una cadena");
    String cadena;
    char caracter;
    cadena = entrada.next();
    System.out.println("-------------------------");
    
    for (int i = 0; i < cadena.length(); i++) {
        caracter = cadena.charAt(i);
        System.out.println(caracter);
    }
    entrada.close();
    }
}
