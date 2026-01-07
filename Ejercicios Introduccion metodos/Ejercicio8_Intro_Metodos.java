import java.util.Scanner;

public class Ejercicio8_Intro_Metodos {
  static void trianguloRectanguloRelleno (int L1){
    for (int j = 0; j < L1 ; j++) {
        for (int i = j; i < L1; i++) {
             System.out.print("*");
        }
       System.out.println();
    }
  } 


  static void trianguloRectanguloVacio (int L2){
    for (int i = 0; i < L2; i++) {
        for (int j = 0; j < L2; j++) {

            if (i == 0 || i == L2 - 1 || j == 0 || j == L2 -1){
                System.out.print("*");
            } else {
                System.out.print( " ");
            }
        }
        System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int lado = 0;
    
    System.out.println("introduce el tamaño del primer lado");
    lado = teclado.nextInt();

    System.out.println("Triangulo Rectangulo Vacío");
    trianguloRectanguloVacio(lado);
    System.out.println(" ");

    System.out.println("Triangulo Rectangulo Relleno");
    trianguloRectanguloRelleno(lado);

    teclado.close();
  }
}
