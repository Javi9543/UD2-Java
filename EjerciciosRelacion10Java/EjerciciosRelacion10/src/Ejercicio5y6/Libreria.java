package Ejercicio5y6;

public class Libreria {
    //Atributos
    private String codigo;
    private String titulo;
    private Autor nombre;
    private static int total = 0;



    //Metodos

    public Libreria(String codigo,  String titulo, Autor nombre){
        this.codigo = codigo;
        this.titulo = titulo;
        this.nombre = nombre;
        total++; 
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getcodigo(){
        return codigo;
    }   

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }


    public Autor getAutor(){
        return nombre;
    }

    public static int getlibros(){
        return total;
    }

    @Override
    public String toString(){
        return getcodigo() + " " + getTitulo() + " " + getAutor();
    }
}

