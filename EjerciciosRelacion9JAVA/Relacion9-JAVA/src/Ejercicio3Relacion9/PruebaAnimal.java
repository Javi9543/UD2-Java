package Ejercicio3Relacion9;

public class PruebaAnimal {
    public static void main(String[] args) {
        animal Animales = new animal();
        mamifero aMamifero = new mamifero();
        ave pajaro = new ave();
        gato aGato = new gato();
        perro aPerro = new perro();

        Animales.comer();
        aMamifero.proteger();
        pajaro.volar();
        aGato.maullar();
        aPerro.jugar();

    }
}
