package Ejercicio6Relacion9;

public class fraccion {
    // Atributos
    private int numerador;
    private int denominador;

    // Metodos
    void setFraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    void getFraccion(){
        System.out.println("La fraccion Introducida es: " + numerador + "/" + denominador);
    }

    void invertir(){
        System.out.println("La fraccion invertida es: " + denominador + "/" + numerador);
    }

    void multiplicar(int num, int den){
        num = num * numerador;
        den = den * denominador;

        System.out.println("La fraccion multiplicada es: " + num + "/" + den);
    }

    void dividir(int num2, int den2){
        num2 = num2 / denominador;
        den2 = den2 / numerador;

        System.out.println("La fraccion dividia es: " + num2 + "/" + den2);
    }
}   

