package Ejercicio5;


public class AutoresYLibros {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Miguel de Cervantes", "Español");
        Autor autor2 = new Autor("Isaac Asimov", "Ruso");
        Libreria libro = new Libreria("001", "Don Quijote de la mancha", autor1);
        Libreria libro2 = new Libreria("002", "Fundacion", autor2);
        Libreria libro3 = new Libreria("003", "El ingenioso hidalgo don Quijote de la Mancha", autor1);
        Libreria libro4 = new Libreria("004", "La Gitanilla", autor1);
        Libreria libro5 = new Libreria("005", "Fundación e Imperio", autor2);
        Libreria libro6 = new Libreria("006", "Fundación y Tierra", autor2);

        System.out.println("Libros: ");
        System.out.println(libro);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
        System.out.println(libro6);
        
        System.out.println(" ");
        System.out.println("Totales: ");
        System.out.println("Total numero de libros: " + Libreria.getlibros());
        System.out.println("Total numero de autores: " + Autor.getAutores());
        

    }
}
