import java.util.Scanner;

class Ejemplo_2_Suma{
    public static void main(String[] args){
        int valor1, valor2, resultado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese valor 1: ");
        valor1 = teclado.nextInt();

        System.out.println("\nIngrese valor 2: ");
        valor2 = teclado.nextInt();
        teclado.close();
        
        resultado = valor1 + valor2;

        System.out.println("\n La suma de los valores ingresados es: " + resultado);
    }
}