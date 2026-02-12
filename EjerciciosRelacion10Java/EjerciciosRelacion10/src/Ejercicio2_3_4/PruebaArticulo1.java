package Ejercicio2_3_4;

public class PruebaArticulo1 {
    public static void main(String[] args) {
        // Creamos los 3 objetos
        Articulos a1 = new Articulos("M001", "Ratón Ergonómico");
        Articulos a2 = new Articulos("P002", "Monitor 27 Dell");
        Articulos a3 = new Articulos("C003", "Cable HDMI 2m");

        // Los almacenamos en el array
        Articulos[] listaArticulos = new Articulos[3];
        listaArticulos[0] = a1;
        listaArticulos[1] = a2;
        listaArticulos[2] = a3;

        // Mostramos el contenido
        for (Articulos art : listaArticulos) {
            System.out.println(art);
        }   
    }
}
