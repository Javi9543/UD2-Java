package Ejercicio7Relacion9;

public class Pizza {
    //atributos de clase
    private String tipo;
    private String tamano;
    private String estado;
    
    //atributos de clase //Los atriburos que pongo aqui, sirven como contadores para saber las pizzas que han sido pedidas y cuales servidas
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    //metodo constructor

    public Pizza(String tipo, String tamano){
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedido";
        Pizza.totalPedidas++;
    }

    public void sirve(){
        if(this.estado.equals("pedido")){  //Este bucle calcula cuales pizzas estan servidas y cuales pedidas
            this.estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("Esta pizza ya esta servida: ");
        }
    }

    public static int getTotalPedidas(){
        return Pizza.totalPedidas;
    }

    public static int getTotalservidas(){
        return Pizza.totalServidas;
    }

    public String toString(){
        return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }
}

