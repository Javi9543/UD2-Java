package Ejercicio1;

public class ArraysAutobus {
    public static void main(String[] args) {
        autobus[] estacion = new autobus[4];

        //Añadir valores al array
        for (int i = 0; i < estacion.length; i++) {
            estacion[i] = new autobus("001MMN", "Pegaso", 300, 70);
        }
        
        //Recorrer el array para mostrar valores

        for (autobus autobus : estacion) {
            System.out.println(autobus);
        }

    }
}