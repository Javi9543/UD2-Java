package Ejercicio2_3_4;

import java.util.Scanner;
import Ejercicio2_3_4.PruebaArticulo3;

public class pruebagetSimAlm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PruebaArticulo3 almacen = new PruebaArticulo3(20);
        String cod, desc = " ";
        int cantidadStock;
        int cantidadAretirar = 0;

        System.out.println("========================================================================");
        System.out.println("Menu de opciones del programa ");
        System.out.println("0. Entrada Automatizada (Creará 4 articulos de prueba del programa)");
        System.out.println("1. Listado (Mostrará todos los datos de los articulos del almacen)");
        System.out.println("2. Alta (Creará un nuevo articulo en el almacen)");
        System.out.println("3. Baja (Dará de baja un articulo en el almacen)");
        System.out.println("4. Entrada de mercancia (aumentará el stock de un determinado articulo)");
        System.out.println("5. Salida de mercancia (disminuye el stock de un determinado articulo)");
        System.out.println("6. Salir");
        System.out.println("========================================================================");
        System.out.println(" ");
        
        int opc = 0;
        do {
            System.out.println("Introduzca una opcion");
            opc = teclado.nextInt();
            teclado.nextLine();
            
            switch (opc) {
                case 0:
                    almacen.almacenarArticulos(new Articulos("001", "Volante Sparco"));
                    almacen.almacenarArticulos(new Articulos("002", "Asiento Bucket de competicion Takata"));
                    almacen.almacenarArticulos(new Articulos("003", "Reloj Revoluciones 11.000rpm"));
                    almacen.almacenarArticulos(new Articulos("004", "Palanca de cambios Sparco"));
                    System.out.println("Creados 4 elementos");
                    break;

                case 1:
                    System.out.println(almacen.toString());
                    break;

                case 2:
                    System.out.println("- Dar alta a un objeto - ");
                    System.out.print("Introduzca el codigo del nuevo articulo: ");
                    cod = teclado.nextLine();

                    System.out.println("Introduzca la descripcion del articulo: ");
                    desc = teclado.nextLine();

                    if (almacen.altaArticulos(cod, desc)) {
                        System.out.println("Los objetos se añadieron al almacen");
                    } else {
                        System.out.println("El almacen esta lleno, elimine algun articulo.");
                    }

                    break;
                case 3:
                    System.out.println(" - Dar de baja a un codigo - ");
                    System.out.println("Introduzca el codigo del articulo a eliminar: ");
                    cod = teclado.nextLine();

                    if (almacen.bajaArticulos(cod)) {
                        System.out.printf("El objeto se ha eliminado correctamente");
                        System.out.println(" ");
                    } else {
                        System.out.println("El objeto no se ha encontrado.");
                        System.out.println(" ");
                    }
                    break;

                case 4:
                    System.out.println(" - Añadir el Stock a un articulo - ");
                    System.out.println(" ");
                    System.out.println("Introduzca el codigo del articulo");
                    cod = teclado.nextLine();

                    System.out.println("Introduzca la cantidad del articulo");
                    cantidadStock = teclado.nextInt();

                    if (almacen.aumentarStock(cod, cantidadStock)) {
                        System.out.println("El stock se ha almacenado correctamente");
                    } else {
                        System.out.println("No se encontró el articulo");
                    }
                    break;

                case 5:
                    System.out.println(" - Eliminar el Stock a un articulo - ");
                    System.out.println(" ");
                    System.out.println("Introduzca el codigo del articulo");
                    cod = teclado.nextLine();

                    System.out.println("Introduzca la cantidad a retirar");
                    cantidadAretirar = teclado.nextInt();

                    if (almacen.eliminarStock(cod, cantidadAretirar)) {
                        System.out.println("El stock se ha almacenado correctamente");
                    } else {
                        System.out.println("No se encontró el articulo");
                    }
                    
                default:
                    if (opc == 6) {
                        System.out.println("Saliendo...");
                    }
                    break;
            }
        } while ( opc < 6 && opc >= 0);
        teclado.close();
    }
}