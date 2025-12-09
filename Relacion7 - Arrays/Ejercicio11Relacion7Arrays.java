public class Ejercicio11Relacion7Arrays {
    public static void main(String[] args){
        //Declaración de Variables:
        int [][] num = {{0,30,2,100,100,5}, {75, 100,100,100,0,100},{100,100,-2,9,100,11}};

        //Imprimir cabecera de la tabla
        System.out.printf("%s, %s, %s, %s, %s, %s, %s\n", 
        "Array num", "Columna0", "Columna1", "Columna2", "Columna3", "Columna4", "Columna5");

        //Escribir tabla
        for (int i = 0; i < num.length; i++) { //longitud de la array
            System.out.printf("Fila %3d |", i);

            for (int j = 0; j < num[i].length; j++) { //mostrar datos del array
                
                if (num[i][j] == 100) {
                    System.out.printf("         ");
                } else {
                    System.out.printf(" %8d", num [i][j]);
                }
            }
            System.out.println(" ");
        }
        
    }
}
