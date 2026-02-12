package Ejercicio2_3_4;

public class PruevaArticulo2 {
    public static void main(String[] args) {
        // Declaramos el array
        Articulos[] arrayArticulo = new Articulos[3];

        // Almacenamos usando el constructor directamente en el array
        arrayArticulo[0] = new Articulos("T001", "Teclado Logitech K860");
        arrayArticulo[1] = new Articulos("A005", "Auriculares Sony WH-1000XM5");
        arrayArticulo[2] = new Articulos("U009", "Pendrive 64GB Kingston");

        // Verificación
        System.out.println("Artículo en la posición 1: " + arrayArticulo[0].getdescripcion());
    }
}

