import java.util.Scanner;

public class Ejercicio2RelacionMetodos {
    public static String convierteEnPalabras(int n){
        String palabra = n + ""; //Esto convierte a cadena el numero introducido por teclado del usuario
        String total = "";

        for (int i = 0; i < palabra.length(); i++) {
            char pal_at = palabra.charAt(i); // Guarda cada numero pasado a string para convertirlo a texto
            String palabraN = ""; //Aqui se guardaran los numeros convertido a texto

            switch (pal_at) {
                case 0:
                    palabraN = "Cero";
                    break;

                case '1':
                   palabraN = "Uno";
                   break;
                
                case '2':
                   palabraN = "Dos";
                   break;
                
                case '3':
                   palabraN = "tres";
                   break;
                
                case '4':
                   palabraN = "Cuatro";
                   break;
                
                case '5':
                   palabraN = "Cinco";
                   break;

                case '6':
                   palabraN = "Seis";
                   break;

                case '7':
                   palabraN = "Siete";
                   break;

                case '8':
                   palabraN = "Ocho";
                   break;
                case '9':
                    palabraN = "Nueve";
                    break;
            }   
            total += palabraN;

            if (i < palabra.length() - 1) {
                total+= ","; // Este if, hace que si el numero siguiente es menor que todos los que se estan convirtiendo a texto pasa a ser u ","
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Introduce un numero para convertirlo a texto: ");
        n = teclado.nextInt();

        System.out.print("El numero " + n + " convertido a texto es " + convierteEnPalabras(n));

        teclado.close();
    }
}
