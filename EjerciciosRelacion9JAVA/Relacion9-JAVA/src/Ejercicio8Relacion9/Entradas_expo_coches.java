package Ejercicio8Relacion9;

import java.util.Scanner;

public class Entradas_expo_coches {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int elegirZona;
        int opc = 0;
        int numEntradas;

        Zona zona1 = new Zona(1000);
        Zona zona2 = new Zona(200);
        Zona zona3 = new Zona(25);

        do {
            System.out.println("-- ENTRADAS PARA EXPOSICION --");
            System.out.println("1- Mostrar numero de entradas libres.");
            System.out.println("2- Vender entradas");
            System.out.println("3- Salir");
            System.out.println("Elija una opcion:");

            opc = entrada.nextInt();

            if (opc == 3){
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (opc) {
                case 1:
                    System.out.println("Introduzca la zona en la que va a estar en la expo (Zona 1, Zona2 o Zona 3): ");
                    elegirZona = entrada.nextInt();

                    if (elegirZona == 1) {
                        System.out.println("Las entradas disponibles la zona 1 son: " + zona1.getEntradasPorVender());

                        System.out.println("Pulse enter para continuar: ");
                        entrada.nextLine();
                        entrada.nextLine();
                    }

                    if (elegirZona == 2) {
                        System.out.println("Las entradas disponibles la zona 2 son: " + zona2.getEntradasPorVender());

                        System.out.println("Pulse enter para continuar: ");
                        entrada.nextLine();
                        entrada.nextLine();
                    }

                    if (elegirZona == 3) {
                        System.out.println("Las entradas disponibles la zona 3 son: " + zona3.getEntradasPorVender());

                        System.out.println("Pulse enter para continuar: ");
                        entrada.nextLine();
                        entrada.nextLine();
                    }

                    if (elegirZona > 3 || elegirZona < 1) {
                        System.out.println("La zona no existe, intentelo de nuevo");

                        System.out.println("Pulse enter para continuar: ");
                        entrada.nextLine();
                        entrada.nextLine();
                    }

                    break;
                case 2:
                    System.out.println("Introduzca la zona en la que va a estar en la expo (Zona 1, Zona2 o Zona 3): ");
                    elegirZona = entrada.nextInt();

                    if (elegirZona == 1) {
                        System.out.println("Introduzca el numero de entradas a comprar");
                        numEntradas = entrada.nextInt();
                        zona1.vender(numEntradas);

                        System.out.println("Pulse enter para continuar: ");
                        entrada.nextLine();
                        entrada.nextLine();
                    }

                    if (elegirZona == 2) {
                        System.out.println("Introduzca el numero de entradas a comprar");
                        numEntradas = entrada.nextInt();
                        zona2.vender(numEntradas);

                        System.out.println("Pulse enter para continuar: ");
                        entrada.nextLine();
                        entrada.nextLine();
                    }

                    if (elegirZona == 3) {
                        System.out.println("Introduzca el numero de entradas a comprar");
                        numEntradas = entrada.nextInt();
                        zona3.vender(numEntradas);

                        System.out.println("Pulse enter para continuar: ");
                        entrada.nextLine();
                        entrada.nextLine();
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
           }
        } while (opc > 0 || opc < 3);
        entrada.close();
    }
}
