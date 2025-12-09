public class Ejercicio7_Relacion_7_Arrays {
    public static void main(String[] args) {
        int tamano = 20;
        int [] numero = new int[tamano];
        int [] cuadrado = new int[tamano];
        int [] cubo = new int[tamano];

        /* Programa Principal */

        for (int i = 0; i < tamano; i++) {
            numero [i] = (int)(Math.random()*101);
            cuadrado [i] = numero [i] * numero [i];
            cubo [i] = cuadrado [i] * numero [i];

        }

        /* Ahora muestro los numeros */
        
        System.out.printf("%8s | %8s | %4s | \n", "NUMERO", "CUADRADO", "CUBO");
        System.out.println("=============================");

        /* Muestro el contenido de los arrays */

        for (int i = 0; i < tamano; i++) {
            System.out.printf("%5d %9d %9d \n", numero [i], cuadrado [i], cubo [i]);
        }
        System.out.println("=============================");
    }
}
