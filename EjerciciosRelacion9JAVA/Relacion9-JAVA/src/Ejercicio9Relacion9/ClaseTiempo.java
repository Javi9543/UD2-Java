package Ejercicio9Relacion9;

public class ClaseTiempo {
    //Atributos
    private int horas;
    private int minutos;
    private int segundos;

    //metodo constructor
    public ClaseTiempo(int h, int m, int s){
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }

    private int ConvertirASegundos(){
        return (this.horas * 3600) + (this.minutos * 60) + this.segundos;
    }

    public void suma(ClaseTiempo t){
        int tot = this.ConvertirASegundos() + t.ConvertirASegundos();   
        this.horas = tot / 3600;
        this.minutos = (tot % 3600) / 60;
        this.segundos = (tot % 60);
    }  

    public void resta(ClaseTiempo t){
        int tot = this.ConvertirASegundos() - t.ConvertirASegundos();

        if (tot < 0) {
            tot = 0;
        }

        this.horas = tot / 3600;
        this.minutos = (tot % 3600) / 60;
        this.segundos = (tot % 60);
    }

    @Override
    public String toString(){
        return horas + "h " + minutos + "m " + segundos + "s";
    }
    
}
