import java.util.Scanner;
public class Ejercicio12Relacion7Arrays {
    public static void main(String[] args){
        //Declarar variables
        Scanner teclado = new Scanner(System.in);
        int [][]num = new int[4][5];
        int sumaFila = 0;
        int sumaCol = 0;
        int sumaTotCol = 0;

        //Pedir los 20 numeros
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++){
                System.out.println("Introduzca 20 numeros para introducirlos al array");
                num [i][j] = teclado.nextInt();
            }            
        }

        //Sumas de filas
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.printf("%4d", num[i][j]);
                sumaFila += num[i][j];        
            }
            System.out.printf("%d\n", sumaFila);
            sumaTotCol += sumaFila;
            sumaFila = 0;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                
            }
        }
        teclado.close();
    }
}