package Ejercicio9Relacion9;

public class PruebaClaseTiempo {
    public static void main(String[] args) {
        ClaseTiempo t1 = new ClaseTiempo(1, 25,30);

        System.out.println("Prueba 1 tiempo");
        System.out.println(t1);

        ClaseTiempo t2 = new ClaseTiempo(0, 120, 0);
        System.out.println("Prueba de que 120 se convierte a tiempo: " + t1);

        ClaseTiempo t3 = new ClaseTiempo(0, 40, 0);
        t2.suma(t3);

        System.out.println("La suma de t2 y t3: ");
        System.out.println(t2);

        ClaseTiempo t4 = new ClaseTiempo(0, 20, 0);
        ClaseTiempo t5 = new ClaseTiempo(2, 0, 0);
        t5.resta(t4);

        System.out.println("La resta de t5 y t4 es: ");
        System.out.println(t5);
    }


}   
