package Ejercicio5y6;
public class Autor {
    //Atributos
    private String nombre;
    private String nacionalidad;
    private static int totalAut;

    // Metodo Constructor
    public Autor(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        totalAut++;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNacionalidad (String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public static int getAutores(){
        return totalAut;
    }
    public String toString(){
        return "Autor: " + getNombre() + " " + getNacionalidad();
    }
}
