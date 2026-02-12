package Ejercicio10Relacion9;

public class Incidencia {
    //Atributos
    private int codigo;
    private int puesto;
    private String desc; 
    private String estado;

    private static int totalPendientes = 0;
    private static int totalResueltos = 0;
    private static int contadorCodigo = 1;

    public Incidencia(int p, String desc){
        this.codigo = contadorCodigo++;
        this.puesto = p;
        this.desc = desc;
        this.estado = " - Pendiente";
        totalPendientes++;
    }

    public void resuleve(String solucion){
        if (this.estado.equals(" - Pendiente")) {
            this.estado = " - Resuelto - " + solucion;
            totalPendientes--;
            totalResueltos++;
        }
    }

    public static int getIncidenciasPendientes(){
        return Incidencia.totalPendientes;
    }
    
    public String toString(){
        return "incidencia " + codigo + " - Puesto " + puesto + " - " + desc + estado;
    }
}
