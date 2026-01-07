import java.util.Scanner;

public class Ejericicio6_Intro_Metodos {

    static void menu (){
        System.out.println("--MENU DE OPCIONES--");
        System.out.println("1 - Saludo");
        System.out.println("2 - Caluclar numero par");
        System.out.println("3 - Salir");

    }

    static void saludo (String nombre){
        
        System.out.println("Hola, " + nombre );
    }

    static void calcularPar (int n1){
        if (n1 % 2 == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int numero = 0;
        String nombre = " ";


        do {
            menu();
            System.out.println("Introduzca una opcion (1 - 3)");
             opcion = teclado.nextInt();
             System.out.println(" ");

            switch (opcion) {
            case 1:
                System.out.println("Introduzca su nombre: ");
                nombre = teclado.next();
                saludo(nombre);
                System.out.println("");
                break;
                
            case 2:
                System.out.println("Introduzca un numero para saber si es par: ");
                numero = teclado.nextInt();
                calcularPar(numero);
                System.out.println(" ");
                break;
            default:
                if (opcion == 3) {
                    System.out.println("Fin del programa");
                } else {
                    System.out.println("Opcion Invalida intentelo de nuevo");
                }
                
                break;
            }
        } while (opcion != 3 );
       teclado.close();
    }
}