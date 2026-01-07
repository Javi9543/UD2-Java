import java.util.Scanner;

public class Ejercicio7_Intro_Metodos {
    static void dibCuadradoRelleno (int L){
        for (int i = 0; i < L; i++) { /* Para las filas */
            for (int j = 0; j < L; j++) { /* Para las columnas */
                 System.out.print("*");
                
               /*else {
                    System.out.print(" ");
                }*/ 
            }
            System.out.println();
        }
    }
    
    static void dibCuadradoVacio(int L2) {

        for (int i = 0; i < L2; i++) { /* Para las filas */
            for (int j = 0; j < L2; j++) { /* Para las columnas */
              if (i == 0 || i == L2 -1 || j == 0 || j == L2 - 1) {
                System.out.print("*");
              } else {
                System.out.print(" ");
              }  
            }
            System.out.println();
        }                                               
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado = 0;

        System.out.println("Introduzca el tamaño del primer lado");
        lado = teclado.nextInt();

        System.out.println("CUADRADO RELLENO: ");
        dibCuadradoRelleno(lado);
        
        System.out.println("CUADRADO VACIO: ");
        dibCuadradoVacio(lado);

        teclado.close();
    }
}