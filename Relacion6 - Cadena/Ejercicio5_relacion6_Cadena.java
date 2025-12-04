import java.util.Scanner;

public class Ejercicio5_relacion6_Cadena {
    public static void main(String[] args) {
        String cadena = "", iniciales = "", cad_final = "";        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una frase");
         cadena = entrada.nextLine();

        cadena = cadena.trim(); //Elimino espacios de la cadena
        cadena += ' '; //dejo un espacio para contar palabras
    
        for (int i = 0; i < cadena.length(); i++) { //Cuento las palabras en este bucle 
            if (cadena.charAt(i) == ' ') {
                iniciales += cad_final.substring(0, 1);
                cad_final = "";
            } else 
                cad_final += cadena.charAt(i); //crea la palabra a partir de letras
            }
        System.out.println(iniciales.toUpperCase());
    entrada.close();
    }
}