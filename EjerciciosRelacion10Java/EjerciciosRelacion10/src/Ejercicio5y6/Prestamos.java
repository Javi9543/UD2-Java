package Ejercicio5y6;

public class Prestamos {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String libroPrestado;
    private String nombreCliente;
    private static int prestamosRealizados = 0;
    private Autor nombre;

    //metodo constructor
    public Prestamos (String fechaPrestamo, String fechaDevolucion, String libroPrestado, String nombreCliente){
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libroPrestado = libroPrestado;
        this.nombreCliente = nombreCliente;
        prestamosRealizados++;
    }

    //metodos

    public void setfechaPrestamo(String fechaPrestamo){
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getfechaPrestamo(){
        return fechaPrestamo;
    }

    public void setfechaDevolucion(String fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getfechaDevolucion(){
        return fechaDevolucion;
    }

    public void setLibroPrestado(String libroPrestado){
        this.libroPrestado = libroPrestado;
    }

    public String getLibroPrestado(){
        return libroPrestado;
    }

    public void setnombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public String getnombreCliente(){
        return nombreCliente;
    }
    
    public Autor getAutor(){
        return nombre;
    }

    public static int getPrestamos(){
        return prestamosRealizados;
    }

    public String toString() {
        return "Nombre libro: " + getLibroPrestado() + ", alquilado desde: " + getfechaPrestamo() + " hasta: " + getfechaDevolucion() + " por el cliente: " + getnombreCliente();
    }

}
