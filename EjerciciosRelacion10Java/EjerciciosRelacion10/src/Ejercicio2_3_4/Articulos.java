package Ejercicio2_3_4;

public class Articulos {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    // Constructor solicitado
    public Articulos(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Métodos Getter y Setter
    public String getcodigo() { 
        return codigo; 
    }

    public void setcodigo(String codigo) { 
        this.codigo = codigo; 
    }

    public String getdescripcion() { 
        return descripcion; 
    }

    public void setdescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getpreciocompra() { return precioCompra; }
    public void setpreciocompra(double precioCompra) { this.precioCompra = precioCompra; }

    public double getprecioVenta() { return precioVenta; }
    public void setprecioVenta(double precioVenta) { this.precioVenta = precioVenta; }

    public int getstock() { return stock; }
    public void setstock(int stock) { this.stock = stock; }

    // Método auxiliar para imprimir los datos
    @Override
    public String toString() {
        return codigo +  " Articulo " + descripcion;
    }
}
