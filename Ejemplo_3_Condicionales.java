import java.util.Scanner;

class Ejemplo_3_Condicionales{
    public static void main(String[] args){
        int valor1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un valor: ");
        valor1 = teclado.nextInt();
        teclado.close();

        if(valor1 <= 10){
            System.out.println("\n El valor: " + valor1 + " es menor a 10");
        }else{
            System.out.println("\n El valor: " + valor1 + " es mayor a 10");
        }
    }
}