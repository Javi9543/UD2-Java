package Ejercicio5Relacion9;

public class PruebaBicicleta {
    public static void main(String[] args) {
        bicicleta miBici = new bicicleta();

        miBici.color = "Negro";
        miBici.velocidad = 0;
        miBici.setMarcha(2);

        System.out.println("El color es: " + miBici.getColor());
        System.out.println("La marcha es: " + miBici.getMarcha());
        System.out.println("La velocidad es: " + miBici.getVelocidad());

        miBici.avanzar();
        miBici.frenar();
        miBici.cambiar();
    }
}