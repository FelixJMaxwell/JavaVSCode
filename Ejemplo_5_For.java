import java.util.Scanner;

class Ejemplo_5_For{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador;

        System.out.println("Ingrese la cantidad de repeticiones: ");
        contador = teclado.nextInt();
        teclado.close();

        for (int i = 0; i < contador; i++) {
            System.out.println("\nEl contador es: " + contador + " y vamos en: " + i);
        }

    }
}