package Ejercicio8Relacion9;

public class Zona {
    private int entradasPorVender;

    public Zona(int n){
        entradasPorVender = n;
    }

    public int getEntradasPorVender(){
        return entradasPorVender;
    }

    public void vender (int n){
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, les entradas para esa zona estan agotadas");
        } else if (entradasPorVender < n){
            System.out.println("Solo me quedan " + this.entradasPorVender + " entradas para esa zona.");
        }

        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("Aqui tiene sus " + n + " entradas, gracias");
        }
    }
}