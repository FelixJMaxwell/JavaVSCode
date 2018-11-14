import java.io.File;
import java.io.IOException;

//Ejemplo utilizando las librerios IO para creacion, lectura, escritura y borrado de archivs
//Ejemplo 1: solo abarca la creacion de archivos.
class IO_1{
    public static void main(String[] args){
        //System.out.println("vamos a crear un archivo con la biblioteca IO");

        try {
            File file = new File("C:\\Users\\cube\\Desktop\\IO.txt");
            //Si el archivo es creado "createNewFile()" regresara verdadero pero si el archivo
            //anterior ya existe devolvera falso
            boolean fvar = file.createNewFile();
            if(fvar){
                System.out.println("Archivo creado correctamente");
            }else{
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Exception ocurred");
            e.printStackTrace();
        }
    }
}