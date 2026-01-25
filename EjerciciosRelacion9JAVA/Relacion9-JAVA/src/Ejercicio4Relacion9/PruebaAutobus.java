package Ejercicio4Relacion9;

public class PruebaAutobus {
    public static void main(String[] args) {
        autobus miAutoBus = new autobus();
        miAutoBus.matricula = "VBX - 403";
        miAutoBus.modelo = "Volvo";
        miAutoBus.numeroPlazas = 30;
        miAutoBus.potenciaCV = 180;

        System.out.println("La matricula del autobus es: " + miAutoBus.getmatricula());
        System.out.println("El modelo del autobus es: " + miAutoBus.getModelo());
        System.out.println("El N de plazas del autobus de: " + miAutoBus.getNumeroPlazas());
        System.out.println("La potencia del autobus es de: " + miAutoBus.getNumeroPlazas());
    }
}
