package Ejercicio6Metodos;

public class Ejercicio6RelacionMetodos {
    public static int[] generaArrayInt(int tamano, int numMin, int numMax) {

        int[] array = new int[tamano];

        for (int i = 0; i < array.length; i++) {
            if (numMin + i <= numMax) { // Esta sentencia if else, hace que se añadan los numeros al array
                array[i] = numMin + i;
            } else { // este else es lo que hace que deje de añadir numeros al array una vez se
                     // llegue al limite
                array[i] = numMax;
            }
        }
        return array;
    }

    public static int minimoArrayInt(int[] array) {
        int minimo = array[0]; // asumimos que el primer numero es el más pequeño
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i]; // esto hace que si el siguiente numero es menor que el actual, actualizando la
                                   // variable a ese numero que es más pequeño
            }
        }

        return minimo;
    }

    public static int maximoArrayInt(int[] array) {
        int maximo = array[0]; // asumimos que el primer numero es el más pequeño
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i]; // esto hace que si el siguiente numero es menor que el actual, actualizando la
                                   // variable a ese numero que es más pequeño
            }
        }

        return maximo;
    }

    public static double mediaArrayInt(int[] array) {
        int suma = 0;
        double media;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        media = suma / array.length;

        return media;

    }

    public static boolean estaEnArrayInt(int[] array, int numero) {
        boolean numEncontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                numEncontrado = true;
                break; // uso break para salir del bucle una vez encontrado el numero
            }

        }

        return numEncontrado;
    }

    public static int posicionEnArray(int[] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i; // Esto guarda la posicion en la que esta el numero guardado en el array
            }
        }
        return -1;
    }

    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length]; // creo un nuevo array con el tamaño del array original

        int ultimoNumero = array.length - 1; // Guardo el ultimo numero del array

        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[ultimoNumero - i]; // Aqui invierto el array
        }

        return invertido;
    }

    public static int[] rotarDerechaArrayInt(int[] array, int n) {
        int tamano = array.length; // guardo el tamaño del array orginal el tamano
        int[] arrayRotado = new int[tamano]; // creo un nuevo array con el mismo tamaño del array anterior
        int nuevaPos;

        for (int i = 0; i < tamano; i++) {
            // roto el array a la deracha
            nuevaPos = (i + n) % tamano;

            arrayRotado[nuevaPos] = array[i];
        }
        return arrayRotado;
    }

    public static int[] rotarIzquierdaArrayInt(int[] array, int n2) {
        int tamano = array.length;
        int[] arrayRotado = new int[tamano];
        int nuevaPos;

        for (int i = 0; i < tamano; i++) { // aqui roto el array a la izquerda

            n2 = n2 % tamano;
            nuevaPos = (i - n2);

            if (nuevaPos < 0){
                nuevaPos = nuevaPos + tamano;
            }
            arrayRotado[nuevaPos] = array[i];
        }
        return arrayRotado;
    }   
}