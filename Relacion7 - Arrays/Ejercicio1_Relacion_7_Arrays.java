import java.util.Scanner;

public class Ejercicio1_Relacion_7_Arrays {
    public static void main(String[] args) {
        /* Variables */
        Scanner teclado = new Scanner(System.in);
        int [] numero = {1, 2 , 1, 3, 5 ,6, 8, 10};
        int contador = 0;
        int num = 0;
        
        System.out.println("Introduzca un numero para ver cuantas veces se repite: ");
        num = teclado.nextInt();

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == num) {
                contador++;    
            }
            
        }
        
        if (contador > 0){
                System.out.printf("El numero %d, aparece %d veces en el array ", num, contador );
                
            } else {
                System.out.println("Tu numero no aparece en el array");
            }

        teclado.close();
    }
}
