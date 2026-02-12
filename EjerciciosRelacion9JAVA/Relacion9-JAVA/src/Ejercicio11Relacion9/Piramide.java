package Ejercicio11Relacion9;

public class Piramide {
    //Atributos
    private int altura;
    private static int contadorPiramides = 0;
    
    public Piramide(int altura){
        this.altura = altura;
        contadorPiramides++;
    }


    public static int getcontadorPiramides(){
        return contadorPiramides;
    }

    @Override
    public String toString(){
        String total = "";
        String espacio = "";
        String relleno = "*";

       for (int i = 0; i < altura - 1; i++)  {
            espacio += " ";
        }

        for (int j = 0; j < altura; j++) {
                total += espacio + relleno + "\n";

                if (espacio.length() > 0) {
                    espacio = espacio.substring(1);
                }
                relleno += "**";
        }
       return total;
    }
}
