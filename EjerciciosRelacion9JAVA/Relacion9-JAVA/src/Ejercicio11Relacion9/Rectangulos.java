package Ejercicio11Relacion9;

public class Rectangulos {
    private int base;
    private int altura;
    private static int contadorRectangulos = 0;

    public Rectangulos(int b, int a) {
        this.base = b;
        this.altura = a;
        contadorRectangulos++;
    }

    public static int getcontadorRectangulos(){
        return contadorRectangulos;
    }

    public String toString(){
        String resultado = "";
        String filas = "";

        for (int i = 0; i < base; i++) {
            filas += "*";
        }

        for (int i = 0; i < altura; i++) {
            resultado += filas + "\n";
        }

        return resultado;
    }
}   

