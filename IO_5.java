import java.io.File;

//Ejemplo utilizando las librerios IO para creacion, lectura, escritura y borrado de archivs
//Ejemplo 5: Abarca el borrado de archivos dada una direccion del mismo

//direccion del archivo file = new File("C:\\Users\\cube\\Desktop\\IO.txt");

public class IO_5{
    public static void main(String[] args){
        try {
            File file = new File("C:\\Users\\cube\\Desktop\\IO.txt");

            if(file.delete()){
                System.out.println(file.getName() + " is deleted");
            }else{
                System.out.println("Delete failed: File didn't delete");
            }
        } catch (Exception e) {
            System.out.println("Exception ocurred");
            e.printStackTrace();
        }
    }
}