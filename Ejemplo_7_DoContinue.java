class Ejemplo_7_DoContinue{
    public static void main(String[] args) {
        int contador = 0;
        do{
            if (contador == 10){
                contador++;
                continue;
            }
            System.out.println(contador + " ");
            contador++;
        }while(contador < 15);
    }
}