package Ejercicio5Relacion9;

public class bicicleta {
    // Atributos
    String color;
    int velocidad;
    int marcha;

    //Metodos
    String getColor() {
        return color;
    }

    int getVelocidad() {
        return velocidad;
    }

    int getMarcha() {
        return marcha;
    }

    void setMarcha(int n) {
        marcha = n;
    }
    
    void avanzar() {
        System.out.println("La bicicleta está avanzando...");
    }

    void frenar(){
        System.out.println("La bicileta está frenando...");
    }

    void cambiar(){
        System.out.println("Cambiando marcha...");
    }
}