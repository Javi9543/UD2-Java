package Ejercicio2_3_4;

import Ejercicio2_3_4.Articulos;

public class PruebaArticulo3 {
    //Atributos

    private Articulos[] listaArticulos;
    private int contador;
    
    //Método constructor
    public PruebaArticulo3(int tamano){ 
        this.listaArticulos = new Articulos[tamano];
        this.contador = 0;
    }

    //Metodos de la clase
    public boolean almacenarArticulos(Articulos nuevoArticulo){
        if (contador < listaArticulos.length) {
            listaArticulos[contador] = nuevoArticulo; //este if hace que añade articulos dentro de la cantidad indicada en el array, si se sobrepasa nos da un mensaje de que esta lleno el array
            contador++;
            return true;           
        } else {
            System.out.println("El array esta lleno, y no se puede añadir más articulos");
            return false;
        }
    }

    public boolean altaArticulos(String codigo, String descripcion){
        Articulos articulo = new Articulos(codigo, descripcion);
        return almacenarArticulos(articulo);
    }

    public boolean bajaArticulos(String codigo){
        for (int i = 0; i < contador; i++) {
            if (listaArticulos[i].getcodigo().equals(codigo)) {

                for (int j = 0; j < contador - 1; j++) {
                    listaArticulos[j] = listaArticulos[j + 1]; //Desplaza una posicion los elementos para nod ejar huecos vacios
                }
                listaArticulos[contador - 1] = null; // deja vacio la posicion del articulo eliminado
                contador--;
                return true; // baja de articulo finalizada
            }
        }
        return false;
    }
    
    public boolean aumentarStock(String Codigo, int cantidad){
        for (int i = 0; i < contador; i++) {
            if (listaArticulos[i].getcodigo().equals(Codigo)){
                int stockActual = listaArticulos[i].getstock();
                listaArticulos[i].setstock(stockActual + cantidad);
                return true;
            }
        }
    
        return false;
    }

    public boolean eliminarStock(String Codigo, int cantidad){
        for (int i = 0; i < contador; i++) {
            if (listaArticulos[i].getcodigo().equals(Codigo)){
                int stockActual = listaArticulos[i].getstock();
                if (stockActual >= cantidad){
                    listaArticulos[i].setstock(stockActual - cantidad);
                    return true;
                } else {
                System.out.println("No hay suficiente stock del articulo");
                return false;
                }
            }
        }
        return false;
    }

    @Override       
    public String toString(){
        String cadena = "";

      for (int i = 0; i < contador; i++) {
            cadena += listaArticulos[i].getcodigo() + " Articulo : " + listaArticulos[i].getdescripcion() + " Stock: " + listaArticulos[i].getstock() + " \n";
      }
    
        return cadena; 
    }
}