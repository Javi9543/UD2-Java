import java.util.Scanner;

public class Ejercicio4RelacionMetodos {
    public static String convierteArrayEnString(int [] a){
        String texto = "";

        for (int i = 0; i < a.length; i++) {
            texto += a[i];
        }

        return texto;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        System.out.println("Introduce cuantos numeros quieres añadir: ");
        n = teclado.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce numero: ");
            a[i] = teclado.nextInt();
        }

        String total = convierteArrayEnString(a);

        System.out.println("Total: " + total);

        teclado.close();
    }
}
