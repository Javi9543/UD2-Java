package Ejercicio1;

public class autobus {
    //Atributos
    String matricula;
    String modelo;
    float potenciaCV;
    int numeroPlazas;
    
    //metodo constructor
    autobus(String mat, String mod, float cv, int nPlazas){
        this.matricula = mat;
        this.modelo = mod;
        this.potenciaCV = cv;
        this.numeroPlazas = nPlazas;
    }

    //metodos

    public String toString(){
        String salida = " Matricula autobus: " + matricula + " modelo: " + modelo + " potencia: " + potenciaCV + " numeroPlazas: " + numeroPlazas;

        return salida;
    }
    void setNumeroPlazas(int plazas){
        numeroPlazas = plazas;
    }
    
    String getmatricula(){
        return matricula;
    }

    String getModelo(){
        return modelo;
    }

    float getPotenciaCV() {
        return potenciaCV;
    }

    int getNumeroPlazas(){
        return numeroPlazas;
    }

}
