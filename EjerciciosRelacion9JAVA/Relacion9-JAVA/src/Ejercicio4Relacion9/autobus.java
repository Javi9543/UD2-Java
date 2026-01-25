package Ejercicio4Relacion9;

public class autobus {
    //Atributos
    String matricula;
    String modelo;
    int potenciaCV;
    int numeroPlazas;
    
    //metodos
    void setNumeroPlazas(int plazas){
        numeroPlazas = plazas;
    }
    
    String getmatricula(){
        return matricula;
    }

    String getModelo(){
        return modelo;
    }

    int getPotenciaCV() {
        return potenciaCV;
    }

    int getNumeroPlazas(){
        return numeroPlazas;
    }

}
