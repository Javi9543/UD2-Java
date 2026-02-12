package Ejercicio11Relacion9;

public class pruebaPiramideRectangulo {
    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Rectangulos r1 = new Rectangulos(4, 3);
        Rectangulos r2 = new Rectangulos(6,2);

        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Piramides creadas: " + Piramide.getcontadorPiramides());
        System.out.println("Rectangulos creados: " + Rectangulos.getcontadorRectangulos());
        
    }
}
    