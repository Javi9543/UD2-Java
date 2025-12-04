import java.util.Scanner;
public class EJercicio4Relacion6Cadenas {
    public static void main(String[] args) {
        String cadena;
        int cantidad = 0;         
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una frase");


        cadena = entrada.nextLine();

        cadena = cadena.trim(); //Elimino espacios de la cadena
        cadena += ' '; //dejo un espacio para contar palabras
    
        for (int i = 0; i < cadena.length(); i++) { //Cuento las palabras en este bucle
          if (cadena.charAt(i) == ' '){ //comprobar espacios para controlar cuantas palabras hay
            cantidad++;
          }
        }
        System.out.println("La cantidad de palabras de tu cadena es: "+ cantidad);
    entrada.close();
  }
}
