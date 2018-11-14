import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

//Ejemplo utilizando las librerios IO para creacion, lectura, escritura y borrado de archivs
//Ejemplo 4: Abarca el agregar informacion a un archivo sin borrar la informacion que ya tiene dentro

//direccion del archivo file = new File("C:\\Users\\cube\\Desktop\\IO.txt");

class IO_4{
    public static void main(String[] args){
        try {
            //string que vamos a guardar en el archivo
            //y la ruta del archivo donde vamos a guardar la string
            String content = "\nsamiclaus" + "@gmail.com";
            File file = new File("C:\\Users\\cube\\Desktop\\IO.txt");
            
            //revisamos si el archivo existe o no, caso de no existir creamos uno nuevo
            if(!file.exists()){
                file.createNewFile();
            }

            //FileWriter acepta dos parametros, el archivo donde se va a escribir y un boleano para saber si
            //escribiremos al final del objeto
            FileWriter fw = new FileWriter(file, true);
            
            //para el caso de bufferedWriter se podria decir que tiene la misma funcion que FileWriter pero 
            //optimizan las funciones de FileWriter
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            //escribimos el string content dentro del archivo
            bw.write(content);
            //cerramos el bufferedwriter
            bw.close();
            System.out.println("Content sucessfully append to the file");
        } catch (IOException ioe) {
            System.out.println("Exception ocurred");
            ioe.printStackTrace();
        }
    }
}